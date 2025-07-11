package com.ProjetoWeb.WebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoWeb.WebProject.entities.Category;
import com.ProjetoWeb.WebProject.entities.OrderItem;
import com.ProjetoWeb.WebProject.entities.User;
import com.ProjetoWeb.WebProject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK> {

}
