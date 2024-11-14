package com.soukaina.productservice.repository;

import com.soukaina.productservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, Long> {
}
