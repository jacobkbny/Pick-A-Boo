package com.tistroy.park.dto;

import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;

import com.tistroy.park.model.Community;
import com.tistroy.park.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommunityDTO {

	private Integer boardno;
	
	private String title;
	
	private String writer;
	
	private String content ;
	
	private MultipartFile image;
	
	private String activation;
	
	private String userid;
	
	private LocalDateTime regdate;
	
	private LocalDateTime moddate;
	
}
