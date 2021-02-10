package kr.co.multi.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.multi.board.dto.User;
import kr.co.multi.board.service.UserService;

@RestController
@RequestMapping(path="/api/users")
public class UserAPIController {
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable(name="id")String id) {
		return userService.getUser(id);
	}
	
	@PostMapping
	public void addUser(@RequestBody User user) {
		userService.joinUser(user);
	}
}
