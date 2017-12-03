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

import pojo.Calculator;

@Controller
public class Main {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndex() {

		return "index";
	}
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String postIndex(Integer a, Integer b, Model m) {
		if(a == null || b == null) return "index";
		Calculator c = new Calculator();
		m.addAttribute("result", c.multiply(a, b));
		m.addAttribute("a", a);
		m.addAttribute("b", b);
		
		return "index";
	}
}
