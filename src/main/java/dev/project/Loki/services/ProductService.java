package dev.project.Loki.services;

import dev.project.Loki.entity.Product;
import dev.project.Loki.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;
    public List<Product> getAllProducts(){
        return repository.findAll();
    }
}
