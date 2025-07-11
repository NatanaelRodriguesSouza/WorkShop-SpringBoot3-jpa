package com.ProjetoWeb.WebProject.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoWeb.WebProject.Service.ProductService;
import com.ProjetoWeb.WebProject.Service.OrderService;
import com.ProjetoWeb.WebProject.entities.Product;
import com.ProjetoWeb.WebProject.entities.Order;

@RestController
@RequestMapping(value = "/Product")
public class ProductResource {
	@Autowired
	private ProductService Product;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = Product.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Integer id) {
		Product obj = Product.findById(id);
		return ResponseEntity.ok().body(obj);

	}
}
