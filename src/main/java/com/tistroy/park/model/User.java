package com.tistroy.park.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User extends BaseEntity {
	@Id
	private String userid;
	@Column
	private String password;
	@Column
	private String nickname;
	@Column
	private LocalDateTime lastsignindate;
	@Column
	private Integer point;
	@Column
	private String status;
	@Column
	private String activation;
}
