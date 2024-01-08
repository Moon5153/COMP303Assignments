package com.assignment3.part2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JobController {
private static List jobList = new ArrayList();
    
    
    @RequestMapping("/job")
    public String job()
    {
        return "job";
    }

    @RequestMapping(value = "/displayJob", method = RequestMethod.POST)
    public ModelAndView saveJob(@ModelAttribute Job job)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("show-job-info");
        jobList.add(job);
        mv.addObject("jobList", jobList);
        return mv;
    }
    

}
