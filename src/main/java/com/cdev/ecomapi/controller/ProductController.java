package com.cdev.ecomapi.controller;

import com.cdev.ecomapi.model.dao.Product;
import com.cdev.ecomapi.model.dto.ProductDTO;
import com.cdev.ecomapi.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> getAllProducts(){
        System.out.println("Test");
        return productService.getProducts().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ProductDTO createProduct(ProductDTO product){
        return convertToDTO(productService.createProduct(product));
    }

    private ProductDTO convertToDTO(Product product){
        return modelMapper.map(product, ProductDTO.class);
    }

}
