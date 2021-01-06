package com.ygort.dsdelivery.services;

import com.ygort.dsdelivery.dto.OrderDTO;
import com.ygort.dsdelivery.entities.Order;
import com.ygort.dsdelivery.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        List<Order> list = repository.findOrdersWithProducts();
        return list.stream().map(order -> new OrderDTO(order)).collect(Collectors.toList());
    }
}
