package com.tistroy.park;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tistroy.park.model.Community;
import com.tistroy.park.model.User;
import com.tistroy.park.repository.CommunityRepository;
import com.tistroy.park.repository.UserRepository;

@SpringBootTest
public class CommunityRepositoryTest {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CommunityRepository communityRepository;
	//게시글 작성
//	@Test
	public void testInsertCommunity() {
		
		Optional<User> optional = userRepository.findById("pkb@gmail.com");
		
		if(optional.isPresent()) {
			User user = optional.get();
			for(int i=0;i<100;i++) {
				Community community = Community.builder().title("Insert Testing").content("This is not Main").user(user).writer(user.getUserid()).activation("T").build();
				communityRepository.save(community);
			
		}
		
				
		}
	}
	//게시글 수정
//	@Test
	public void testModifyCommunity() {
			String content = "this is modified2";
			User user = User.builder().userid("pkb@gmail.com").build();
					
			Optional<Community> optional = communityRepository.findById(95);
			
			if(optional.isPresent()) {
				Community community = optional.get();
				community.setContent(content);
				community.setModDate(LocalDateTime.now());
				communityRepository.save(community);
				System.out.println("게시글 수정이 완료되었습니다.");
			}
			}
	//게시글 삭제
//	@Test
	public void testDeleteCommunity() {
		
		Optional<Community> optional_community = communityRepository.findById(95);
		
		if(optional_community.isPresent()) {
			Community community = optional_community.get();
			community.setActivation("F");
				communityRepository.save(community);
			System.out.println("게시글 삭제가 완료되었습니다.");
		}
	}
		// 전체 데이터 불러오기
//	@Test
	public void testgetCommunityList() {
		
		List<Community> list = communityRepository.findBoardByActivation("T");
					list.stream().forEach(a -> System.out.println(a));
	}
	
	//특정 작성자의 글을 가져오기
//	@Test
	public void testgetWriterContent() {
		
		List<Community> list = communityRepository.findBoardByWriterAndActivation("pkb@gmail.com", "F");
			list.stream().forEach(a -> System.out.println(a));
	}
	
}
