package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
//	@RequestMapping(path="/greet", method=RequestMethod.GET)
	
//	@GetMapping("greet")
//	public String sayHello(ModelMap model) {
//		model.addAttribute("name","Nitin");
//		return "details";
//	}
	
//	@GetMapping("greet")
//	public String sayHello() {
//	
//		return "details";
//	}
	
	
//	@RequestMapping(path="/greet", method=RequestMethod.POST)
	@PostMapping("greet")
	public String sayHello(@RequestParam String name, ModelMap model) {
		System.out.print(name);
		model.put("name", name);
	
		return "details";
	}
	
	
	
	
	//@RequestMapping(method=RequestMethod.GET)
	@GetMapping("")
	public String sayHelloInnitial() {
		
		return "index";
	}
}
