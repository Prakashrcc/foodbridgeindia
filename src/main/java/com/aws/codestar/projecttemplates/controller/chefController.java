package com.aws.codestar.projecttemplates.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class chefController {
	@RequestMapping("/chef")
	public String func(HttpServletRequest request,HttpServletResponse response) {
		
		return "chef";
	}

}
