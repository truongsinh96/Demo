package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Main {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndex() {

		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String postIndex(@RequestParam Date date, Model m) {
		Integer.parseInt("aaa");
		m.addAttribute(date);
		return "index";
	}

	@ExceptionHandler
	public ModelAndView handleException(Exception e){
		ModelAndView m = new ModelAndView();
		m.setViewName("error");
		m.addObject("message", e.getMessage());
		return m;
	}
}
