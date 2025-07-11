package com.ProjetoWeb.WebProject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ProjetoWeb.WebProject.entities.Category;
import com.ProjetoWeb.WebProject.entities.Order;
import com.ProjetoWeb.WebProject.entities.User;
import com.ProjetoWeb.WebProject.repositories.CategoryRepository;
import com.ProjetoWeb.WebProject.repositories.OrderRepository;
import com.ProjetoWeb.WebProject.repositories.UserRepository;
@Service
public class CategoryService {

	@Autowired
	private CategoryRepository category;
	public List<Category> findAll() {
		return category.findAll();
	}

	public Category findById(Integer id) {
		Optional<Category> obj = category.findById(id);
		return obj.get();
	}
}
