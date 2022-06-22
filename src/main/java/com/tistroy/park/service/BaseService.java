package com.tistroy.park.service;

import com.tistroy.park.dto.CommunityDTO;
import com.tistroy.park.dto.ReplyDTO;
import com.tistroy.park.dto.UserDTO;
import com.tistroy.park.model.Community;
import com.tistroy.park.model.Reply;
import com.tistroy.park.model.User;

public interface BaseService {
	
	
	
	
//	default DtoToEntity() {}
	
//	default EntityToDto() {}
	
	public default UserDTO userEntityToDTO(User user) {
		UserDTO dto = UserDTO.builder().
				userid(user.getUserid()).
				password(user.getPassword()).
				nickname(user.getNickname()).
				point(user.getPoint()).
				lastsignindate(user.getLastsignindate()).
				status(user.getStatus())
				.regdate(user.getRegDate())
				.moddate(user.getModDate())
				.build();
		return dto;
	}
	
	public default User userDtoToUserEntity(UserDTO dto) {
		User user = User.builder()
				.userid(dto.getUserid())
				.password(dto.getPassword())
				.nickname(dto.getNickname())
				.point(dto.getPoint())
				.lastsignindate(dto.getLastsignindate())
				.activation(dto.getActivation())
				.status(dto.getStatus())
				.build();
			return user;
	}
	
	public default CommunityDTO communityEntityToDTO(Community community) {
		
		CommunityDTO dto = CommunityDTO.builder().boardno(community.getBoardno())
				.title(community.getTitle())
				.content(community.getContent())
				.writer(community.getWriter())
				.regdate(community.getRegDate())
				.moddate(community.getModDate())
				.activation(community.getActivation())
				.build();
		
			return dto;
	}
	
	public default Community communityDtoToEntity(CommunityDTO dto) {
		
		Community community = Community.builder()
							.boardno(dto.getBoardno())
							.title(dto.getTitle())
							.writer(dto.getWriter())
							.content(dto.getContent())
							.activation(dto.getActivation())
							.build();
		
				return community;
	}
	
	public default ReplyDTO	replyEntityToReplyDto(Reply reply) {
		
		ReplyDTO dto = ReplyDTO.builder()
						.boardno(reply.getBoardno())
						.content(reply.getContent())
						.replyer(reply.getReplyer())
						.activation(reply.getActivation())
						.build();
			return dto;
		
	}
	
	public default Reply replyDtoToReplyEntity(ReplyDTO dto) {
		Reply reply = Reply.builder()
					.boardno(dto.getBoardno())
					.replyer(dto.getReplyer())
					.content(dto.getContent())
					.activation(dto.getActivation())
					.build();
			return reply;
					
	}
}
