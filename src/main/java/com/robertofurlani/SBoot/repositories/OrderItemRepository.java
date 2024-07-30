package com.robertofurlani.SBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertofurlani.SBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
