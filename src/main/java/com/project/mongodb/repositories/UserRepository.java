package com.project.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
