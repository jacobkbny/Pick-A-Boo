package com.tistroy.park.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tistroy.park.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {
	
	
	List<Reply> findByReplyerAndActivation(String replyer, String activation);
	
	List<Reply> findAllByBoardno(Integer boardno);

}
