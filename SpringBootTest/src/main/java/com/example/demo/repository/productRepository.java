package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.product;
@Repository
public interface productRepository extends JpaRepository<product,Integer> {

}
