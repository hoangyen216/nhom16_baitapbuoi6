package com.hoangyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hoangyen.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
