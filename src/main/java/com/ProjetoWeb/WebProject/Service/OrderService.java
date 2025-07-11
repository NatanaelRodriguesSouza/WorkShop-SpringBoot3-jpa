package com.ProjetoWeb.WebProject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ProjetoWeb.WebProject.entities.Order;
import com.ProjetoWeb.WebProject.entities.User;
import com.ProjetoWeb.WebProject.repositories.OrderRepository;
import com.ProjetoWeb.WebProject.repositories.UserRepository;
@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Integer id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
