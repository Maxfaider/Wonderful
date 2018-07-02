package io.amecodelabs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
	
	@RequestMapping(value = "/bonderland", method = RequestMethod.GET)
	public String getViewBonderland(ModelMap model) {
		model.addAttribute("web", "Bonderland");
		return "home";
	}
	
	@RequestMapping(value = {"/jungle", "/jungle/*"}, method = RequestMethod.GET)
	public ModelAndView getViewJungle(HttpServletRequest request) {
		request.setAttribute("web", "Jungle");
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/empire", method = RequestMethod.GET)
	public String getViewEmpire(ModelMap model) {
		model.addAttribute("web", "empire");
		return "home";
	}

}
