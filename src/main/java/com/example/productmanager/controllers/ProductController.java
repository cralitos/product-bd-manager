package com.example.productmanager.controllers;

import com.example.productmanager.entities.Product;
import com.example.productmanager.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.create(product);
    }
    @PutMapping(value = "/{id}")
    public Product modifyProduct(@PathVariable Long id, @RequestBody Product product){
        return productService.modifyProduct(id, product);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.delete(id);
    }
}
