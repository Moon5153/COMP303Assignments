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
public class PaymentController {
	
	@Autowired
	private PaymentRepository paymentRepository;

	@RequestMapping("/payment")
	public ModelAndView payment(HttpServletRequest request) {
		int driverId = (int) request.getSession().getAttribute("driverId");
		if (request.getSession().getAttribute("email") != null) {
			
			return new ModelAndView("payment","id",driverId);
		}
		else
		{
			return new ModelAndView("index","error","Please Login to view the Payment Page");
		}
	}

	@PostMapping("/processPayment")
	public @ResponseBody ModelAndView processPayment(HttpServletRequest request,
			@RequestParam("paymentDate") String paymentDate,
            @RequestParam("amount") double amount,
            @RequestParam("paymentMethod") String paymentMethod)
 
	{
		if (request.getSession().getAttribute("driverId") != null) {		
			int driverId = (int) request.getSession().getAttribute("driverId");
			Payment payment = new Payment(paymentDate,amount,paymentMethod,driverId);
			paymentRepository.save(payment);
			ModelAndView receipt=new ModelAndView("reciept","payment",payment);
			receipt.addObject("message","Payment Successful!!");
			return receipt;
		}else {
			return new ModelAndView("index","error","Please Login to make the Payment!!");
		}
	}

}
