package com.khit.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter*/
@Data
public class UserDTO {
	//필드
	private Long id;        //회원 번호
	private String userId;  //회원 아이디(세션)
	private String userPasswd;
	private String userName;
	private String userAge;
}
