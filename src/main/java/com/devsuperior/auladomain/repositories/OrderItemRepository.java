package com.devsuperior.auladomain.repositories;

import com.devsuperior.auladomain.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
