package com.hoangyen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoangyen.model.Product;
import com.hoangyen.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<Product> GetAll(){
		return repo.findAll();
	}
	public Product getProductByID(int id){
        Optional<Product> optionalBook = repo.findById(id);
        return optionalBook.orElse(null);
    }
	public void add(Product newProduct) {
		repo.save(newProduct);
	}
	public void update(Product newProduct) {
		repo.save(newProduct);
	}
	public void delete(int  id) {
		repo.deleteById(id);
	}
}
