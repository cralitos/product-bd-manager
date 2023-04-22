package com.example.productmanager.services;

import com.example.productmanager.dao.ProductDao;
import com.example.productmanager.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;
    @Override
    public List<Product> findAll() {
        return (List<Product>) productDao.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productDao.findById(id).orElse(null);
    }

    @Override
    public Product create(Product product) {
        return productDao.save(product);
    }

    @Override
    public Product modifyProduct(Long id, Product product) {
        if (productDao.existsById(id)){
            product.setId(id);
            return productDao.save(product);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (productDao.existsById(id)){
            productDao.deleteById(id);
        }

    }
}
