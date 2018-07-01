package io.amecodelabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
	
	@RequestMapping(value = "/bonderland", method = RequestMethod.GET)
	public String getViewBonderland(ModelMap model) {
		model.addAttribute("web", "Bonderland");
		return "home";
	}
	
	@RequestMapping(value = "/jungle", method = RequestMethod.GET)
	public String getViewJungle(ModelMap model) {
		model.addAttribute("web", "Jungle");
		return "home";
	}
	
	@RequestMapping(value = "/empire", method = RequestMethod.GET)
	public String getViewEmpire(ModelMap model) {
		model.addAttribute("web", "empire");
		return "home";
	}

}
