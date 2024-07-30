package com.robertofurlani.SBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertofurlani.SBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
