package com.khit.todoweb.service;

import org.springframework.stereotype.Service;

import com.khit.todoweb.dto.TodoDTO;
import com.khit.todoweb.mapper.TodoMapper;
import com.khit.todoweb.vo.TodoVO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TodoServiceImpl implements TodoService{

	private TodoMapper todoMapper;
	
	@Override
	public void insert(TodoDTO todoDTO) {
		//DTO�� VO�� ��ȯ�ؾ� -> DB�� �����͸� ����
		//1. ���(ModelMapper)�� ������ ���
		TodoVO todoVO = TodoVO.builder()
				.title(todoDTO.getTitle())
				.writer(todoDTO.getWriter())
				.build();
		
		todoMapper.insert(todoVO);
	}

}
