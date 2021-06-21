package com.example.authen.controller;

import com.example.authen.entity.Product;
import com.example.authen.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/generate/product")
public class GenerateProduct {
    @Autowired
    private ProductRepository productRepository;

    private static ArrayList<Product> listProduct = new ArrayList<>();
    @RequestMapping(method = RequestMethod.GET)
    public String Seeding() {
        productRepository.deleteAll();

        Product product1 = new Product(1, "Keyboard", 1000);
        Product product2 = new Product(2, "Laptop HP", 2000);
        Product product3 = new Product(3, "Macbook 2021", 4000);
        Product product4 = new Product(4, "Keyboard2", 1000);
        Product product5 = new Product(5, "Keyboard3", 5000);
        Product product6 = new Product(6, "Keyboard4", 6000);
        Product product7 = new Product(7, "Keyboard5", 1000);
        Product product8 = new Product(8, "Keyboard6", 9000);
        Product product9 = new Product(9, "Keyboard7", 10000);
        Product product10 = new Product(10, "Keyboard10", 11000);
        for (Product dis :
                listProduct) {
            productRepository.save(dis);
        }
        return "Seeding Done!";
}}
