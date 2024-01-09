package com.khit.todoweb.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
public class PageResponseDTO<E> { //��ϰ� ������ �̵��� ���� DTO
	//���׸����� ����� ���� - ȸ������, �Խ��� ��ü�� ������ ó���� �� ����
	private int page;
	private int size;
	private int total;
	
	//���������� ��ȣ
	private int startPage;
	//������ ������
	private int endPage;
	
	//���� ������ ���� ����
	private boolean prev;
	//���� ������ ���� ����
	private boolean next;
	
	//��� ������
	private List<E> dtoList;
	
	//������
	@Builder(builderMethodName = "withAll")
	public PageResponseDTO(PageRequestDTO pageRequestDTO, 
			List<E> dtoList, int total) {
		this.page = pageRequestDTO.getPage();
		this.size = pageRequestDTO.getSize();
		
		this.total = total;
		this.dtoList = dtoList;
		
		//�ϴ�- 1,2,3,4,5,6,7,8,9,10
		this.endPage = (int)(Math.ceil((double)this.page/10))*10;
		this.startPage = this.endPage - 9;
		
		//total - 83�ΰ��,  8.3 -> 9.3 -> 9
		int maxPage = (int)(Math.ceil((double)total/size));
		if(endPage > maxPage)
			endPage = maxPage;
		
		//����
		this.prev = this.startPage > 1;
		//����
		this.next = total > (this.endPage * this.size);
	}
	
}







