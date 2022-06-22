package com.tistroy.park.dto;

import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
	
	private String userid;
	
	private String password;
	
	private String nickname;
	
	private LocalDateTime lastsignindate;
	
	private MultipartFile image;
	
	private Integer point;
	
	private String status;
	
	private String activation;
	
	private LocalDateTime regdate;
	
	private LocalDateTime moddate;

	
	
}
