package com.assignment3.part2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class OrganizationController {
private static List organizationList = new ArrayList();
    
    @RequestMapping("/")
    public String home()
    {
        return "index";
    }
    
    @RequestMapping("/organization")
    public String organization()
    {
        return "organization";
    }

    @RequestMapping(value = "/display", method = RequestMethod.POST)
    public ModelAndView saveOrganization(@ModelAttribute Organization organization)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("show-org-info");
        organizationList.add(organization);
        mv.addObject("organizationList", organizationList);
        return mv;
    }

}
