package com.example.productmanager.dao;

import com.example.productmanager.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {
}
