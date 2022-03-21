package com.ss;

import java.io.Console;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cust.Customer;

@Controller
public class HeeloWordController {
	@GetMapping("/helloWorld")
	public String helloWorld(Model model) {
		Customer customer=new  Customer();
			model.addAttribute("info",customer);
		return "hello-world";
	}
//	@GetMapping("/helloWorld")
//	public String helloWorld(@ModelAttribute("info")Customer customer) {
//	
//		return "hello-world";
//	}

	@ResponseBody
	@GetMapping("/bye")
	public String bye() {
		return "bye bye uys!!";
	}

    
//	@RequestMapping("/process-homepage")
//	public String response(@RequestParam String userName,@RequestParam String crushName,Model model) {
//    Customer customer=new Customer();
//	    customer.setCrushName(crushName);
//        customer.setUserName(userName);
//	    String customerDetails=customer.toString();
////		System.out.println("userName : "+userName);
////		System.out.println("crushName : "+crushName);
//		model.addAttribute("abc", customer.getUserName());
//		model.addAttribute("xyz", customer.getCrushName());
//		model.addAttribute("pqr", customer.toString());
//
//		
//		return "response-page";
//
//	}
	@RequestMapping("/process-homepage")
	public String response(Customer customer,Model model) {
	String customerDetails=customer.toString();
	System.out.println("userName : "+customer.getCrushName());
	System.out.println("crushName : "+customer.getUserName());
	model.addAttribute("pqr",customerDetails);
	model.addAttribute("abc", customer.getCrushName());
	model.addAttribute("xyz", customer.getUserName());
		
		return "response-page";

	}
	
}
