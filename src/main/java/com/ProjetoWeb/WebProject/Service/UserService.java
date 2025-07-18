package com.ProjetoWeb.WebProject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ProjetoWeb.WebProject.Service.exceptions.DatabaseException;
import com.ProjetoWeb.WebProject.Service.exceptions.ResourceNotFoundException;
import com.ProjetoWeb.WebProject.entities.User;
import com.ProjetoWeb.WebProject.repositories.UserRepository;
import com.ProjetoWeb.WebProject.resource.exceptions.ResourceExceptionHandler;

import jakarta.persistence.EntityNotFoundException;
@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	public List<User> findAll() {
		return repository.findAll();
	}

	
	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		try {
		repository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Integer id ,User obj) {
		try {
		User entity = repository.getReferenceById(id);
		updateData(entity,obj);
		return repository.save(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}


	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
