package com.tistroy.park.dto;

import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReplyDTO {
	
	private Integer boardno;
	
	private Integer replyno;
	
	private String replyer;
	
	private String content;
	
	private String activation;
	
	private MultipartFile image;
	
	private LocalDateTime regdate;
	
	private LocalDateTime moddate;
	
	

}
