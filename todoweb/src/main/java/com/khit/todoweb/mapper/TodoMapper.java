package com.khit.todoweb.mapper;

import com.khit.todoweb.vo.TodoVO;

public interface TodoMapper {
	
	public String getTime();   //���� �ð� �׽�Ʈ
	
	public void insert(TodoVO todoVO);  //����ϱ�
}
