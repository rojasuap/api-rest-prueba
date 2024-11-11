package com.nttdata.api_rest_prueba.dao.repositories;

import com.nttdata.api_rest_prueba.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findByOrderNumber(String orderNumber);
}
