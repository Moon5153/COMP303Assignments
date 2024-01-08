package com.assignment3.part1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@ResponseBody
	@RequestMapping("")
	public String home()
	{
		return "A Recruitment Web service created";
	}
}
