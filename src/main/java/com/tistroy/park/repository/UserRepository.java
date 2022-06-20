package com.tistroy.park.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tistroy.park.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	
		public Optional<User> findByNickname(String nickname);
		
		

}
