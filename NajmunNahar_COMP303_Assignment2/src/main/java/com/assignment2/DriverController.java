package com.assignment2;
/* Name: Najmun Nahar
 * Course: COMP-303
 * Assignment-2
 * 
 */

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
public class DriverController {

	@Autowired
	private DriverRepository driverRepository;
	
	@RequestMapping("/index")
	public ModelAndView index()
	{
		return new ModelAndView("index","error",null);
	}
	
	@RequestMapping("/home")
	public ModelAndView home(HttpServletRequest request) {	    
		if (request.getSession().getAttribute("email") != null) {
			String email=(String)request.getSession().getAttribute("email");
			Driver driver = driverRepository.findByEmail(email);
			ModelAndView home=new ModelAndView("home","drivers",driver);
			home.addObject("msg", null);
			return home;
		}
		else
		{
			return new ModelAndView("index","error","Please login to access the home page!!");
		}
	}
	@PostMapping("/home")
	public @ResponseBody ModelAndView login(@RequestParam("email") String email,
            @RequestParam("password") String password, HttpServletRequest request)
 
	{
		Driver driver = driverRepository.findByEmail(email);
		 // checking if the driver exists
	    if (driver != null) {
	    	// checking if the password matches from the database
	    	if (driver.getPassword().equals(password)) {
	    		
	    		// saving driver Id and email in the session
	    		request.getSession().setAttribute("driverId", driver.getDriverId());
	    		request.getSession().setAttribute("email", driver.getEmail());
	    		request.getSession().setAttribute("firstName", driver.getFirstName());
	    		
	    	
	    		return new ModelAndView("home","drivers",driver);
	    	} else {
	    		return new ModelAndView("index","error","Incorrect Username/password");
	    	}
	    } else {   
    		return new ModelAndView("index","error","Account does not exist");
	    }
	}

	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}

	@PostMapping("/add")
	public @ResponseBody ModelAndView add(
            @RequestParam("dateOfBirth") String dateOfBirth,
            @RequestParam("address") String address,
			@RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("licenseNo") String licenseNo,
            @RequestParam("licenseState") String licenseState,
			@RequestParam("policyId") int policyId)
 
	{
		Driver driver = new Driver(firstName,lastName,dateOfBirth,address, phoneNumber, email, password, licenseNo, licenseState,policyId);
		driverRepository.save(driver);
		return new ModelAndView("index","message","Registration successful!!");
	}
	
	@RequestMapping("/view-profile")
	public ModelAndView viewProfile(HttpServletRequest request,Model model) {
		if (request.getSession().getAttribute("email") != null) {
			String email = (String) request.getSession().getAttribute("email");
		    Driver driver = driverRepository.findByEmail(email);
		    if (driver != null) {
		    	model.addAttribute("driverId", driver.getDriverId());
		    	model.addAttribute("email", driver.getEmail());
		    	model.addAttribute("firstName", driver.getFirstName());
		    	model.addAttribute("lastName", driver.getLastName());
		    	model.addAttribute("phoneNumber", driver.getPhoneNumber());
		    	model.addAttribute("address", driver.getAddress());
		    	model.addAttribute("dateOfBirth", driver.getDateOfBirth());
		    	model.addAttribute("password", driver.getPassword());
		    	model.addAttribute("licenseNo", driver.getLicenseNo());
		    	model.addAttribute("licenseState", driver.getLicenseState());
		    	model.addAttribute("policyId", driver.getPolicyId());
		    	return new ModelAndView("view-profile","driver",driver);
		    }else {
		    	return new ModelAndView("index");
		    }
		}
		 return new ModelAndView("index");
 
    }

	@PostMapping("/update-profile")
	public @ResponseBody ModelAndView updateProfile(@RequestParam("driverId") int driverId, @RequestParam("dateOfBirth") String dateOfBirth,
			 @RequestParam("address") String address,
				@RequestParam("firstName") String firstName,
	            @RequestParam("lastName") String lastName,
	            @RequestParam("phoneNumber") String phoneNumber,
				@RequestParam("email") String email,
	            @RequestParam("password") String password,
	            @RequestParam("licenseNo") String licenseNo,
	            @RequestParam("licenseState") String licenseState) {
		Driver driver = new Driver(driverId,firstName,lastName,dateOfBirth,address, phoneNumber, email, password, licenseNo, licenseState);
		driverRepository.save(driver);
		ModelAndView updateProfile=new ModelAndView("home","drivers",driver);
		updateProfile.addObject("msg","Profile Updated!!");
		return updateProfile;
	}
	
	
	// mapping for logout GET route to clear the session and redirect to index
	@RequestMapping("/logout")  
	public String logout(HttpServletRequest request)
	{
		request.getSession().setAttribute("driverId", null);
		request.getSession().setAttribute("email", null);
		return "redirect:/index";
	}


}

