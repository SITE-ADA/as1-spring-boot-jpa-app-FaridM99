package com.CrudTesting.CrudTesting.services;

import com.CrudTesting.CrudTesting.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository <Product, Integer> {



}
