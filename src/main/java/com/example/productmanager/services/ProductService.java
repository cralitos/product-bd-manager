package com.example.productmanager.services;

import com.example.productmanager.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
    Product findById(Long id);
    Product create(Product product);
    Product modifyProduct(Long id, Product product);
    void delete(Long id);
}
