package com.khit.todoweb.mapper;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.khit.todoweb.vo.TodoVO;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class TodoMapperTest {
	
	@Autowired //�ڵ����� - todoMapper�� new�ѰŶ� ����
	private TodoMapper todoMapper;
	
	@Test
	public void testGetTime() {
		log.info(todoMapper.getTime());
	}
	
	@Test
	public void testInsert() {
		//������ 1�� ���� - setter -> builder()
		
		/*TodoVO todoVO = new TodoVO();
		//todoVO.setTno(1L);
		todoVO.setTitle("���� ��ϱ�");
		todoVO.setWriter("ȫ�浿");
		//todoVO.setCreatedDate(new Timestamp(System.currentTimeMillis()));*/
		
		TodoVO todoVO = TodoVO.builder()
				.title("20�� ��ϱ�")
				.writer("user01")
				.build();
		
		todoMapper.insert(todoVO);
	}
}
