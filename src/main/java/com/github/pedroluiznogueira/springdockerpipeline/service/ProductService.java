package com.github.pedroluiznogueira.springdockerpipeline.service;

import com.github.pedroluiznogueira.springdockerpipeline.model.Product;
import com.github.pedroluiznogueira.springdockerpipeline.repository.ProductReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductReposiroty productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Product registerProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long productId, Product product) {
        Product productToUpdate = productRepository.findById(productId).get();

        productToUpdate.setName(product.getName());
        productToUpdate.setPrice(product.getPrice());

        return productRepository.save(productToUpdate);
    }

    public String deleteProduct(Long productId) {
        Product productToDelete = productRepository.findById(productId).get();
        productRepository.delete(productToDelete);
        return "product deleted";
    }
}
