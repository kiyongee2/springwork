package com.khit.todoweb.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.khit.todoweb.dto.TodoDTO;
import com.khit.todoweb.mapper.TodoMapperTest;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class TodoServiceTest {
	
	@Autowired
	private TodoService todoService;
	
	@Test
	public void testInsert() {
		//���� �Էµ� �ڷ�� �����ؼ� db�� ����
		TodoDTO todoDTO = TodoDTO.builder()
				.title("���డ��")
				.writer("travel")
				.build();
		
		todoService.insert(todoDTO);
	}
	
}
