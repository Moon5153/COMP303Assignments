package com.assignment3.part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizationController {
	
	@Autowired
    OrganizationService organizationService;
	
	//GET
    @RequestMapping(value = "/organization/{orgId}", method = RequestMethod.GET)
    Organization getOrganization(@PathVariable("orgId") int orgId) throws Exception {
        return organizationService.getOrganization(orgId);
    }

    @RequestMapping(value = "/organizations", method = RequestMethod.GET)
    Iterable<Organization> getOrganizations() {
        return organizationService.getOrganizations();
    }
    //POST
    @RequestMapping(value = "/organization", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addOrganization(@RequestBody Organization org) throws Exception {
        organizationService.addOrganization(org);
    }
    //PUT
    @RequestMapping(value = "/organization/{orgId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateOrganization(@PathVariable("orgId") int orgId, @RequestBody Organization org) throws Exception {
        org.setOrgId(orgId);
        organizationService.updateOrganization(org);
    }
    //DELETE
    @RequestMapping(value = "/organization/{orgId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteOrganization(@PathVariable("orgId") int orgId) throws Exception {
        organizationService.deleteOrganization(orgId);
    }


}
