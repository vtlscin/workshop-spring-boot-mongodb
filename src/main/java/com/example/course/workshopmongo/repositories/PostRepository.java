package com.example.course.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.course.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
