package com.tistroy.park.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@EqualsAndHashCode(callSuper = false)
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reply extends BaseEntity {

	private Integer boardno;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer replyno;
	@Column
	private String replyer;
	@Column(name = "replycontent")
	private String content;
	@Column
	private String activation;
	
}
