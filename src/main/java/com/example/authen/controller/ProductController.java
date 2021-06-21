package com.example.authen.controller;

import com.example.authen.entity.Product;
import com.example.authen.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @RequestMapping(method = RequestMethod.GET)
    public Product getProduct(int id) {
        Product product = productRepository.getById(id);
        return product;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getAll() {
        List productList = productRepository.findAll();
        return productList;
    }

}
