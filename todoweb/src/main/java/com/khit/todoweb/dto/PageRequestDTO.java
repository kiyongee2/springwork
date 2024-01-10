package com.khit.todoweb.dto;

import java.util.Arrays;

import lombok.Data;

@Data
public class PageRequestDTO {
	private int page = 1;    //������ ��ȣ
	private int size = 10;   //�������� �Խñ� ��
	
	private String[] types;  //�˻� ����
	private String keyword;  //�˻���
	
	//skip - ����(����)
	public int getSkip() {  //#{skip}
		return (page - 1) * 10;   //1p-0, 2p-10
	}
	
	//�˻�����(t,w) üũ�ڽ� üũ
	public boolean checkedType(String type) {
		//Ÿ�Կ� üũ�� ������ ��ȯ���� ����
		if(types == null || types.length == 0) {
			return false;
		}
		
		//Ÿ�Կ� ��ġ�ϴ� ������ ��ȯ��
		return Arrays.stream(types).anyMatch(type::equals);
	}
}
