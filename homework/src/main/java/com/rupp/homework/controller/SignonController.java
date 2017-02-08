package com.rupp.homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignonController {
	@RequestMapping("/signon")
	public String getSignOnPage(){
		return "signon";
	}

}
