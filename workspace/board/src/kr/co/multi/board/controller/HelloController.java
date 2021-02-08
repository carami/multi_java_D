package kr.co.multi.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hi")
	public String hello() {
		return "hello";
	}
}
