package com.tistroy.park;


import java.time.LocalDateTime;
import java.util.Optional;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tistroy.park.model.User;
import com.tistroy.park.repository.UserRepository;



@SpringBootTest
public class RepositoryTest {
	@Autowired
	private UserRepository userRepository;
	
//	@Test
	public void inserttest() {
			
		for (int i =0 ; i<100; i++) {
			
		User user = User.builder().userid("pkb"+i+"@gmail.com").password("12345").nickname("pkb"+i).point(i*100).lastsignindate(LocalDateTime.now()).build();
		
		
		userRepository.save(user);
		}

			
	}
	
	@Test
	public void updateTest() {
			
			String userid = "pkb0@gmail.com";
				Optional<User> optional_id = userRepository.findById(userid);
			String nickname = "pkb100";
			Optional<User> optional=userRepository.findByNickname(nickname);
				
				if(optional.isPresent()) {
					System.out.println("이미 존재하는 닉네임 입니다.");
				}else {
					User user = optional_id.get();
						user.setNickname(nickname);
						System.out.println("닉네임이 정상적으로 변경 되었습니다");
						userRepository.save(user);
				}
			
			
			
				
			
				
			
		
	}
}
