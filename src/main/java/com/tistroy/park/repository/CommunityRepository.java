package com.tistroy.park.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tistroy.park.model.Community;
import com.tistroy.park.model.User;

public interface CommunityRepository extends JpaRepository<Community, Integer> {
	
			List<Community> findBoardByUser(User user);
			
			List<Community> findBoardByActivation (String Activation);
			
			List<Community> findBoardByWriterAndActivation(String writer, String activation);
			
			

}
