package com.khit.web.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ReplyDTO {
	private Long id;       //��� ��ȣ
	private Long boardId;  //�Խñ� ��ȣ
	private String replyer; //�ۼ���
	private String replyContent; //��� ����
	private Timestamp createdTime; //�ۼ���
	private Timestamp updatedTime; //������
}
