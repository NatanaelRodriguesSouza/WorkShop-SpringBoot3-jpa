package com.ProjetoWeb.WebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoWeb.WebProject.entities.Category;
import com.ProjetoWeb.WebProject.entities.Product;
import com.ProjetoWeb.WebProject.entities.User;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
