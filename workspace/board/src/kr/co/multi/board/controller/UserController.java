package kr.co.multi.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String join(@ModelAttribute User user) {
		int result = userService.joinUser(user);
		if(result == 1)
			return "redirect:/hi";
		else
			return "redirect:/user/joinForm";
	}
	@GetMapping("/list")
	public String list(Model model) {
		List<User> users = userService.getUsers();
		model.addAttribute("userList", users);
		return "user/list2";
	}
	
}
