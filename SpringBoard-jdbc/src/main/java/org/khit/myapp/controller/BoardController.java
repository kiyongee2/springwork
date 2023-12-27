package org.khit.myapp.controller;

import org.khit.myapp.dto.BoardDTO;
import org.khit.myapp.repository.BoardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@RequestMapping("/board")
@Controller //bean ��ü�� ���
public class BoardController {
	
	//������ ���� new
	private BoardRepository boardRepository;

	@GetMapping("/write")
	public String writeForm() {
		return "board/write";
	}
	
	@PostMapping("/write")
	public String write(BoardDTO boardDTO) {
		log.info("boardDTO=" + boardDTO);
		boardRepository.save(boardDTO);
		return "redirect:/";
	}
}
