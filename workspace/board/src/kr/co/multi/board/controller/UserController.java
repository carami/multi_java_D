package kr.co.multi.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.multi.board.dto.User;
import kr.co.multi.board.service.UserService;

@Controller
@RequestMapping(path = "/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	@PostMapping("/join")
	public String join(User user) {
		int result = userService.joinUser(user);
		if(result == 1)
			return "redirect:/hi";
		else
			return "redircet:/user/joinForm";
	}
}
