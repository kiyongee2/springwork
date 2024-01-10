package com.khit.todoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khit.todoweb.dto.AjaxDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class AjaxController { //Ajax ��û ó�� ��Ʈ�ѷ�

	@GetMapping("/ex01")
	public String ex01() {
		log.info("GET ��û ó��");
		return "/ajax-ex/main";   //main.jsp
	}
	
	//@ResponseBody - ���ڿ��� ��ȯ
	@PostMapping("/ex02")
	public @ResponseBody String ex02() {
		log.info("POST ��û ó��");
		return "/ajax-ex/main";   //���ڿ� - /ajax-ex/main
	}
	
	@GetMapping("/ex03")
	public @ResponseBody String ex03(
			@RequestParam("greet") String greet,
			@RequestParam("num") int num) {
		log.info("greet: " + greet);
		log.info("num: " + num);
		return "success";
	}
	
	//ajaxDTO�� object(��ü)�̹Ƿ� json(�ڹٽ�ũ��Ʈ ������)���� ��ȯ�� ����
	//jackson-databind�� ��������� ��
	@PostMapping("/ex04")
	public @ResponseBody AjaxDTO ex04(@ModelAttribute AjaxDTO ajaxDTO) {
		log.info("ajaxDTO=" + ajaxDTO);
		return ajaxDTO;   //���ڿ� - /ajax-ex/main
	}
}
