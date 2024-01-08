package com.assignment2;
/* Name: Najmun Nahar
 * Course: COMP-303
 * Assignment-2
 * 
 */
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PolicyController {
	
	@Autowired
	private PolicyRepository policyRepository;
	

	@RequestMapping("/policy")
	public ModelAndView policy(HttpServletRequest request,Model model) {
		//if the email is saved in the session/if the user is logged in then can view the policy page
		if (request.getSession().getAttribute("email") != null) {
			int policyId=(int)request.getSession().getAttribute("policyId");
			Policy policy = policyRepository.findById(policyId);
			return new ModelAndView("policy","policy",policy);
		}
		else
		{
			return new ModelAndView("index","error","Please Login to view the Policy Page!!");
		}

	}
	
	@PostMapping("/policy")
	public @ResponseBody ModelAndView processPayment(HttpServletRequest request,
			@RequestParam("policyId") int policyId,
			@RequestParam("policyNo") int policyNo,
            @RequestParam("effectiveDate") String effectiveDate,
            @RequestParam("expDate") String expDate,
            @RequestParam("totalAmount") double totalAmount,
            @RequestParam("status") String status)
 
	{
		if (request.getSession().getAttribute("email") != null) {		
			Policy policy = new Policy(policyId,policyNo,effectiveDate,expDate,totalAmount,status);
			
			request.getSession().setAttribute("policyId", policy.getPolicyId());
			request.getSession().setAttribute("policyNo", policy.getPolicyNo());
			request.getSession().setAttribute("effectiveDate", policy.getEffectiveDate());
			
			policyRepository.save(policy);
			ModelAndView policyModel=new ModelAndView("policy","policy",policy);
			policyModel.addObject("message", "Policy updated!!");
			return policyModel;
		}else {
			return new ModelAndView("index");
		}
	}


	


}
