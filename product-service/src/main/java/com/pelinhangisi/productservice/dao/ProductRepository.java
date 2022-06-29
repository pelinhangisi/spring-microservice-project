package com.pelinhangisi.productservice.dao;

import com.pelinhangisi.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository <Product , String> {
}
