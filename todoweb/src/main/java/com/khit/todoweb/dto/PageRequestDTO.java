package com.khit.todoweb.dto;

import java.util.Arrays;

import lombok.Data;

@Data
public class PageRequestDTO {
	private int page = 1;    //페이지 번호
	private int size = 10;   //페이지당 게시글 수
	
	private String[] types;  //검색 유형
	private String keyword;  //검색어
	
	//skip - 간격(범위)
	public int getSkip() {  //#{skip}
		return (page - 1) * 10;   //1p-0, 2p-10
	}
	
	//검색유형(t,w) 체크박스 체크
	public boolean checkedType(String type) {
		//타입에 체크가 없으면 반환값이 없음
		if(types == null || types.length == 0) {
			return false;
		}
		
		//타입에 일치하는 유형을 반환함
		return Arrays.stream(types).anyMatch(type::equals);
	}
}
