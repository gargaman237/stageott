package com.stage.ott.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stage.ott.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
}
