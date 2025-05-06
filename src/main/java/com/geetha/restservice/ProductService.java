package com.geetha.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
    ProductRepository repository;

    public void save(Product product){
        repository.save(product);
    }

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(int id){
        return repository.getReferenceById(id);
    }

    public void deleteById(int id){
        repository.deleteById(id);
    }
    
    public Product updateProduct(Integer id, Product updateProduct) {
		System.out.println("Product to be updated with details: " + updateProduct);
		return repository.findById(id).map(product -> {
		    product.setName(updateProduct.getName());
		    product.setPrice(updateProduct.getPrice());
		    System.out.println(product);
		    repository.save(product);
		    return product;
		}).orElse(null);
    }
}
