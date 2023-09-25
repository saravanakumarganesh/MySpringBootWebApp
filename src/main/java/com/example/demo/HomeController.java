package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView home(String aid, String aname, String lang) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("aid", aid);
		mv.addObject("aname", aname);
		mv.addObject("lang", lang);
		mv.setViewName("home");
		return mv;
	}

}