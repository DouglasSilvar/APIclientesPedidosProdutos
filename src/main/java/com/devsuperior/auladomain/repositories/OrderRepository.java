package com.devsuperior.auladomain.repositories;

import com.devsuperior.auladomain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
