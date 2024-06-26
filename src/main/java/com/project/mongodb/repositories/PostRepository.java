package com.project.mongodb.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.mongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	public List<Post> findByTitleContainingIgnoreCase(String text);
}
