package com.assignment3.part1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class JobService {
	Map<Integer, Job> jobRepository = new HashMap<>();

    public void addJob(Job job) throws Exception {
    	//check existence
        if(jobRepository.containsKey(job.getJobId())) {
            throw new Exception("This job Id already exists");
        }
        else {
           jobRepository.put(job.getJobId(), job);
        }
    }
    //get the list
    public Iterable<Job> getJobs(){
        return jobRepository.values();
    }
    //get a job specified by jobId
    public Job getJob(int jobId) throws Exception {

        if(jobRepository.containsKey(jobId)) {
            return jobRepository.get(jobId);
        }
        else {
            throw new Exception("Job Id not found");
        }
    }
    //update a job
    public void updateJob(Job job) throws Exception {
        if(jobRepository.containsKey(job.getJobId())) {
        	jobRepository.put(job.getJobId(), job);
        }
        else {
            throw new Exception("Job Id not found");
        }
    }
    //delete a job
    public void deleteJob(int jobId) throws Exception {
        if(jobRepository.containsKey(jobId)) {
        	jobRepository.remove(jobId);
        }
        else {
            throw new Exception("Job Id not found");
        }
    }

}
