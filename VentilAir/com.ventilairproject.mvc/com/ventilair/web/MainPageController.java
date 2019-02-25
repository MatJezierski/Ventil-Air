package com.ventilair.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {
	
	@RequestMapping("/home")
	public String showHomePage() {
		
		return "index";
	}
}
