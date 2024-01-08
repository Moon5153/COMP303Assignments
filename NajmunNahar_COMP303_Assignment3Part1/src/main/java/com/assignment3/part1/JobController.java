package com.assignment3.part1;
/*
 * Author: Najmun Nahar
 * ID: 301160081
 * COMP-303
 * Assignment-3
 */
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
public class JobController {
	@Autowired
    JobService jobService;
	
	//GET
    @RequestMapping(value = "/job/{jobId}", method = RequestMethod.GET)
    Job getJob(@PathVariable("jobId") int jobId) throws Exception {
        return jobService.getJob(jobId);
    }

    @RequestMapping(value = "/jobs", method = RequestMethod.GET)
    Iterable<Job> getJobs() {
        return jobService.getJobs();
    }
    
    //POST
    @RequestMapping(value = "/job", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addOrganization(@RequestBody Job job) throws Exception {
        jobService.addJob(job);
    }
    //PUT
    @RequestMapping(value = "/job/{jobId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateJobn(@PathVariable("jobId") int jobId, @RequestBody Job job) throws Exception {
        job.setJobId(jobId);
        jobService.updateJob(job);
    }
    //DELETE
    @RequestMapping(value = "/job/{jobId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteJob(@PathVariable("jobId") int jobId) throws Exception {
        jobService.deleteJob(jobId);
    }

}
