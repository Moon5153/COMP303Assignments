package com.assignment3.part1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
/*
 * Author: Najmun Nahar
 * ID: 301160081
 * COMP-303
 * Assignment-3
 */

@Service
public class CandidateService {
	Map<Integer, Candidate> candidate = new HashMap<>();
	//add candidate
    public void addCandidate(Candidate candt) throws Exception {
        if(candidate.containsKey(candt.getCandidateId())) {
            throw new Exception("This candidate Id already exists");
        }
        else {
           candidate.put(candt.getCandidateId(), candt);
        }
    }
    
    //get the list
    public Iterable<Candidate> getCandidates(){
        return candidate.values();
    }
    
    //get a candidate specified by candidateId
    public Candidate getCandidate(int candidateId) throws Exception {

        if(candidate.containsKey(candidateId)) {
            return candidate.get(candidateId);
        }
        else {
            throw new Exception("Candidate Id not found");
        }
    }
    
    //update a candidate
    public void updateCandidate(Candidate candt) throws Exception {
        if(candidate.containsKey(candt.getCandidateId())) {
            candidate.put(candt.getCandidateId(), candt);
        }
        else {
            throw new Exception("Candidate Id not found");
        }
    }
    //delete a candidate
    public void deleteCandidate(int candidateId) throws Exception {
        if(candidate.containsKey(candidateId)) {
            candidate.remove(candidateId);
        }
        else {
            throw new Exception("Candidate Id not found");
        }
    }

}
