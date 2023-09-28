package com.saga.orderservice.service;

import com.saga.orderservice.entity.Order;
import com.saga.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class OrderService {
    @Autowired
    OrderRepository orderDao;

    public Order createOrder(Order order) {
        return orderDao.save(order);
    }
}
