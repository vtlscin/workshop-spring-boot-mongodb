package com.example.course.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.workshopmongo.domain.User;
import com.example.course.workshopmongo.dto.UserDTO;
import com.example.course.workshopmongo.repositories.UserRepository;
import com.example.course.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll()
	{
		return repository.findAll();
	}
	
	public User findById (String Id)
	{
		Optional<User> user = repository.findById(Id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj)
	{
		return repository.insert(obj);
	}
	
	public User fromDTO(UserDTO obj)
	{
		return new User(obj.getId(), obj.getName(), obj.getEmail());
	}
	
	public void delete (String Id)
	{
		findById(Id);
		repository.deleteById(Id);
	}
}
