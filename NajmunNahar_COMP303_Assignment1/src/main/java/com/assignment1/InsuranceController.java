package com.assignment1;
/*Author: Najmun Nahar
 * ID: 301160081
 * Course: COMP-303
 * Date:10-02-2022
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InsuranceController {
	@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public ModelAndView handleForm(@ModelAttribute("insurance") Insurance insurance)
	{
		return new ModelAndView("show-quotation", "insurance", insurance); 
	}

}
