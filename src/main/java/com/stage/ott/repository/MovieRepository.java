package com.stage.ott.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stage.ott.entity.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {
}
