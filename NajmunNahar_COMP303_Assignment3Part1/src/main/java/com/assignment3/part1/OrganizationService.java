package com.assignment3.part1;
/*
 * Author: Najmun Nahar
 * ID: 301160081
 * COMP-303
 * Assignment-3
 */
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
	Map<Integer, Organization> organization = new HashMap<>();
	//add new job
    public void addOrganization(Organization org) throws Exception {
        if(organization.containsKey(org.getOrgId())) {
            throw new Exception("This organization Id already exists");
        }
        else {
           organization.put(org.getOrgId(), org);
        }
    }
    //get the list
    public Iterable<Organization> getOrganizations(){
        return organization.values();
    }
    //get organiztion specified by organization id
    public Organization getOrganization(int orgId) throws Exception {

        if(organization.containsKey(orgId)) {
            return organization.get(orgId);
        }
        else {
            throw new Exception("Organization Id not found");
        }
    }
    //update a organization
    public void updateOrganization(Organization org) throws Exception {
        if(organization.containsKey(org.getOrgId())) {
            organization.put(org.getOrgId(), org);
        }
        else {
            throw new Exception("Organization Id not found");
        }
    }
    //delete a organization 
    public void deleteOrganization(int orgId) throws Exception {
        if(organization.containsKey(orgId)) {
            organization.remove(orgId);
        }
        else {
            throw new Exception("Organization Id not found");
        }
    }

}
