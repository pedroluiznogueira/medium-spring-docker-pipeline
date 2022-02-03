package com.github.pedroluiznogueira.springdockerpipeline.controller;

import com.github.pedroluiznogueira.springdockerpipeline.model.Product;
import com.github.pedroluiznogueira.springdockerpipeline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/find")
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @PostMapping("/register")
    public Product registerProduct(@RequestBody Product product) {
        return productService.registerProduct(product);
    }

    @PutMapping("/update/{productId}")
    public Product updateProduct(
            @PathVariable ("productId") Long productId,
            @RequestBody Product product
    ) {
        return productService.updateProduct(productId, product);
    }

    @DeleteMapping("/delete/{productId}")
    public String deleteProduct(@PathVariable ("productId") Long productId) {
        return productService.deleteProduct(productId);
    }
}
