package com.ProjetoWeb.WebProject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoWeb.WebProject.entities.Product;
import com.ProjetoWeb.WebProject.repositories.ProductRepository;
@Service
public class ProductService {

	@Autowired
	private ProductRepository product;
	public List<Product> findAll() {
		return product.findAll();
	}

	public Product findById(Integer id) {
		Optional<Product> obj = product.findById(id);
		return obj.get();
	}
	
	
}
