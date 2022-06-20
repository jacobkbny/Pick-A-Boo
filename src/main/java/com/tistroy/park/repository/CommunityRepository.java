package com.tistroy.park.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tistroy.park.model.Community;

public interface CommunityRepository extends JpaRepository<Community, Integer> {

}
