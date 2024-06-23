package com.stage.ott.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stage.ott.entity.TVShow;

public interface TVShowRepository extends MongoRepository<TVShow, String> {
}
