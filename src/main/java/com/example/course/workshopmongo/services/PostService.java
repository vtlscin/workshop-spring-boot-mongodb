package com.example.course.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.workshopmongo.domain.Post;
import com.example.course.workshopmongo.repositories.PostRepository;
import com.example.course.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public Post findById(String id)
	{
		Optional<Post> post =  repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}
