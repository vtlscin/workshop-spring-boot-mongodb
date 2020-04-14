package com.example.course.workshopmongo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.course.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	List<Post> findByTitleContainingIgnoreCase(String text);
	
	/**
	 * @param title é o campo a ser pesquisado
	 * 		  ?0 significa que é o primeiro parametro, ?1 seria o segundo
	 * 	      i signifca que é case insensitive
	 * @return
	 */
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }") 
	List<Post> searchTitle(String text);
	
	@Query("{ $and: [ {date: {$gte: ?1} }, {date: {$lte: ?2} } , {$or: [ {'title': { $regex: ?0, $options: 'i' }}, {'body': { $regex: ?0, $options: 'i' } }, {'comments.text': { $regex: ?0, $options: 'i' }  } ] } ] }")
	List<Post> fullSearch(String text, Date minDate, Date maxDate);
}
