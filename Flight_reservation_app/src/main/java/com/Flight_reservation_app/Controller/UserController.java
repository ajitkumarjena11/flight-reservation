package com.Flight_reservation_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_reservation_app.entity.User;
import com.Flight_reservation_app.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/showLogin")
	public String showLogin() {
		return "login/login";
	}
  
	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}
	@RequestMapping("/SaveReg")
	public String saveReg(@ModelAttribute("User") User user) {
		userRepo.save(user);
		  return "login/login";
		  }
	
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId")  String emailId, @RequestParam("password") String password, ModelMap model) {
		User user = userRepo.findByEmail(emailId);
		if (user != null) {
		if (user.getEmail().equals(emailId)  && user.getPassword().equals(password)) {
			return "findFlights";
		}
		model.addAttribute("error","Please Enter Valid username");
		 return "login/login";
		}else {
			model.addAttribute("error","Please Enter Valid username");
			 return "login/login";
		}
	}
}
