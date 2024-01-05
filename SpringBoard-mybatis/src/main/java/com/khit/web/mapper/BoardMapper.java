package com.khit.web.mapper;

import java.util.List;
import java.util.Map;

import com.khit.web.dto.BoardDTO;

public interface BoardMapper {

	void insert(BoardDTO boardDTO);  //글쓰기

	List<BoardDTO> findAll();   //글 목록

	BoardDTO findById(Long id); //글 상세보기

	void updateHit(Long id);  //조회수 증가

	void delete(Long id);     //글 삭제

	void update(BoardDTO boardDTO);

	List<BoardDTO> pagingList(Map<String, Integer> pagingParam);

	int boardCount();

}
