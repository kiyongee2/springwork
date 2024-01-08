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
	
	@Autowired //자동주입 - todoMapper가 new한거랑 같음
	private TodoMapper todoMapper;
	
	@Test
	public void testGetTime() {
		log.info(todoMapper.getTime());
	}
	
	@Test
	public void testInsert() {
		//데이터 1개 생성 - setter -> builder()
		
		/*TodoVO todoVO = new TodoVO();
		//todoVO.setTno(1L);
		todoVO.setTitle("매일 운동하기");
		todoVO.setWriter("홍길동");
		//todoVO.setCreatedDate(new Timestamp(System.currentTimeMillis()));*/
		
		TodoVO todoVO = TodoVO.builder()
				.title("20분 운동하기")
				.writer("user01")
				.build();
		
		todoMapper.insert(todoVO);
	}
}
