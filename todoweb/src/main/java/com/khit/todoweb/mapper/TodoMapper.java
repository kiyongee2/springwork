package com.khit.todoweb.mapper;

import java.util.List;

import com.khit.todoweb.vo.TodoVO;

public interface TodoMapper {
	
	public String getTime();   //���� �ð� �׽�Ʈ
	
	public void insert(TodoVO todoVO);  //����ϱ�
	
	List<TodoVO> findAll();
}
