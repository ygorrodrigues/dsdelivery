package com.ygort.dsdelivery.repositories;

import com.ygort.dsdelivery.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
