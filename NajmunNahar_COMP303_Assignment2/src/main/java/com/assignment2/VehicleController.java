package com.assignment2;
/* Name: Najmun Nahar
   ID:301160081
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
public class VehicleController {
	@Autowired
	private VehicleRepository vehicleRepository;

	@RequestMapping("/vehicle")
	public ModelAndView payment(HttpServletRequest request) {
		if (request.getSession().getAttribute("email") != null) {
			
			return new ModelAndView("vehicle");
		}
		else
		{
			return new ModelAndView("index","error","Please Login to view the Vehicle Page!!");
		}
	}
	@PostMapping("/vehicle")
	public @ResponseBody ModelAndView processPayment(HttpServletRequest request,
			@RequestParam("vinNo") String vinNo,
            @RequestParam("policyId") int policyId,
            @RequestParam("year") String year,
            @RequestParam("make") String make,
            @RequestParam("model") String model,
            @RequestParam("mileage") double mileage)
 
	{
		if (request.getSession().getAttribute("driverId") != null) {		
			Vehicle vehicle = new Vehicle(policyId,vinNo,year,make,model,mileage);
			vehicleRepository.save(vehicle);
			ModelAndView vehicleModel=new ModelAndView("vehicle","vehicle",vehicle);
			vehicleModel.addObject("message","Vehicle Information added to schema!!");
			return vehicleModel;
		}else {
			return new ModelAndView("index","error","Please Login to add vehicle info!!");
		}
	}

	

}
