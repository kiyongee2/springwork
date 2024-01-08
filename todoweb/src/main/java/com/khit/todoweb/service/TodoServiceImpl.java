package com.khit.todoweb.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.khit.todoweb.dto.TodoDTO;
import com.khit.todoweb.mapper.TodoMapper;
import com.khit.todoweb.vo.TodoVO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TodoServiceImpl implements TodoService{

	private TodoMapper todoMapper;
	
	private ModelMapper modelMapper;
	
	@Override
	public void insert(TodoDTO todoDTO) {
		//DTO를 VO로 변환해야 -> DB에 데이터를 저장
		//1. 모듈(ModelMapper)을 사용안한 경우
		/*TodoVO todoVO = TodoVO.builder()
				.title(todoDTO.getTitle())
				.writer(todoDTO.getWriter())
				.build();*/
		
		//2. 모듈(ModelMapper)을 사용
		TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
		todoMapper.insert(todoVO);
	}

	@Override
	public List<TodoDTO> findAll() {
		 //vo를 dto로 변환(db -> 브라우저화면)
		 //vo 리스트 데이터 가져오기
		 List<TodoVO> voList = todoMapper.findAll();
		 
		 //vo리스트를 dto로 저장하고 반환함(람다식으로 구현)
		 List<TodoDTO> dtoList = voList.stream()
				 .map(vo -> modelMapper.map(vo, TodoDTO.class))
				 .collect(Collectors.toList());
		 
		return dtoList;
	}

}
