package com.github.pedroluiznogueira.springdockerpipeline.repository;

import com.github.pedroluiznogueira.springdockerpipeline.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReposiroty extends JpaRepository<Product, Long> {
}
