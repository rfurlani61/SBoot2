package com.robertofurlani.SBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertofurlani.SBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
