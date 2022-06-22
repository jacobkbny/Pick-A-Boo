package com.tistroy.park;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tistroy.park.model.Reply;
import com.tistroy.park.repository.ReplyRepository;
@SpringBootTest
public class ReplyRepositoryTest {
	
	@Autowired
	private ReplyRepository replyRepository;
	//댓글 삽입
//	@Test
	public void insertReply() {
		
		
		for(int i =0 ; i<10; i++) {
			
			Reply reply = Reply.builder().boardno(50).replyer("jacob").content("this is reply"+i).activation("T").build();
			replyRepository.save(reply);
		}
		
	}
	//댓글 수정
//	@Test
	public void modifyReply() {
		Optional<Reply> optional = replyRepository.findById(3);
		
		if(optional.isPresent()) {
			Reply reply = optional.get();
			reply.setContent("this has been modified");
			reply.setModDate(LocalDateTime.now());
			
			replyRepository.save(reply);
		}
		
		
	}
		//댓글 삭제
//	@Test
	public void deleteReplyTest() {
		Optional<Reply> optional = replyRepository.findById(3);
		
		if(optional.isPresent()) {
			Reply reply = optional.get();
				reply.setActivation("F");
				replyRepository.save(reply);
		}
		
	}
	//게시글의 댓글 가져오기
	
//	@Test
	public void getReplys() {
		Integer boardno = 50;
		List<Reply> list = replyRepository.findAllByBoardno(boardno);
		if(list.size()<0) {
			String str = "아직 댓글이 없습니다";
		}
		list.stream().forEach(a->System.out.println(a));
	}
	//특정 사람의 댓글을 가져오기
//	@Test
	public void getReplyersReply() {
		
			String replyer="jacob";
		List<Reply> list = replyRepository.findByReplyerAndActivation(replyer,"T");
		
			if(list.size()<1) {
				String str = "작성한 댓글이 아직 없습니다";
				System.out.println(str);
			}
			
			list.stream().forEach(a -> System.out.println(a));
	}
	
	
	
	
	

}
