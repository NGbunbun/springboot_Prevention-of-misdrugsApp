package com.example.preventionofmisdrugs;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@GetMapping("/")
	@PreAuthorize("isAuthenticated()")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("title", "TOP PAGE");
		mav.addObject("msg", "Wellcome!!");
		return mav;
	}

}
