package com.ss;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cust.RegistraionPOJO;

@Controller
public class RegistrationController {
	@RequestMapping("/register")
//public String regPage(Model m) {
//		RegistraionPOJO dto=new RegistraionPOJO();
//		dto.setName("Gaurav");
//		m.addAttribute("userReg",dto);
//	return "user-reg-page";
//}
	public String regPage(@ModelAttribute("userReg") RegistraionPOJO dto) {

		dto.setName("Gaurav");
		dto.setUserName("gauravSharmamsd.@gmail.com");
		
	
	

		return "user-reg-page";
	}
	@RequestMapping("/reg-success")
	public String processReg(@ModelAttribute("data") RegistraionPOJO dto ) {
		return "reg-success";
	}
}
