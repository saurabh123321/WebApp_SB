package com.example.SimpleWebApp.service;

import com.example.SimpleWebApp.model.Product;
import com.example.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

//    List<Product> productList = new ArrayList<>(Arrays.asList(
//            new Product(101, "IPhone", 2000),
//            new Product(102, "Samsung", 400),
//            new Product(103, "Moto", 3000))) ;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductFromID(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProducts(Product product){
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
