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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CandidateController {
	
	@Autowired
    CandidateService candidateService;
	
	//GET
    @RequestMapping(value = "/candidate/{candidateId}", method = RequestMethod.GET)
    Candidate getCandidate(@PathVariable("candidateId") int candidateId) throws Exception {
        return candidateService.getCandidate(candidateId);
    }

    @RequestMapping(value = "/candidates", method = RequestMethod.GET)
    Iterable<Candidate> getCandidates() {
        return candidateService.getCandidates();
    }
    //POST
    @RequestMapping(value = "/candidate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addCandidate(@RequestBody Candidate candt) throws Exception {
        candidateService.addCandidate(candt);
    }
    
    //PUT
    @RequestMapping(value = "/candidate/{candidateId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateCandidate(@PathVariable("candidateId") int candidateId, @RequestBody Candidate candt) throws Exception {
        candt.setCandidateId(candidateId);
        candidateService.updateCandidate(candt);
    }
    
    //DELETE
    @RequestMapping(value = "/candidate/{candidateId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteCandidate(@PathVariable("candidateId") int candidateId) throws Exception {
        candidateService.deleteCandidate(candidateId);
    }

}
