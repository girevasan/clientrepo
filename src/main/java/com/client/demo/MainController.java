package com.client.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@Autowired
	UserRepo userrepo;
	
	@RequestMapping(value="/form",method=RequestMethod.GET)
	public String form() {
		return "form";
	}
	@RequestMapping(value="/success",method=RequestMethod.POST)
	public ModelAndView success(User user) {
		ModelAndView mav = new ModelAndView("success");
		System.out.println(user.getId());
		System.out.println(user.getEmailid());
		System.out.println(user.getName());
		mav.addObject(user);
		userrepo.save(user);
		return mav;
	}
}