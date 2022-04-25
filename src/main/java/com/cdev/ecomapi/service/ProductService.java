package com.cdev.ecomapi.service;

import com.cdev.ecomapi.model.dao.Product;
import com.cdev.ecomapi.model.dto.ProductDTO;
import com.cdev.ecomapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProduct(Integer id){
        return productRepository.getById(id);
    }

    public Product createProduct(ProductDTO product){
        Product product1 = new Product();
        return product1;
    }
}
