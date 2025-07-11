package com.ProjetoWeb.WebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoWeb.WebProject.entities.Category;
import com.ProjetoWeb.WebProject.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
