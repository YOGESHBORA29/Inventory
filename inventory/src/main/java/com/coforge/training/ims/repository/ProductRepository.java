package com.coforge.training.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.ims.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
