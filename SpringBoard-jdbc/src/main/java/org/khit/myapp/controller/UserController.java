package org.khit.myapp.controller;

import org.khit.myapp.dto.UserDTO;
import org.khit.myapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@RequestMapping("/user")
@Controller
public class UserController {
	
	private UserService userService;
	
	//ȸ������ ������
	@GetMapping("/join")
	public String join() {
		return "/user/join";
	}
	
	//ȸ�� ���� ó��
	@PostMapping("/join")
	public String join(UserDTO userDTO) {
		log.info("userDTO=" + userDTO);
		userService.save(userDTO);
		return "redirect:/";  //�ε����� �̵�
	}
}
