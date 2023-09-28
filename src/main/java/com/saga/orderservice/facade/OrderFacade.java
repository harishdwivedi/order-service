package com.saga.orderservice.facade;

import com.saga.orderservice.dto.OrderDTO;
import com.saga.orderservice.entity.Order;
import com.saga.orderservice.service.OrderService;
import com.saga.orderservice.util.OrderValidator;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderFacade {
    @Autowired
    OrderService orderService;
    @Autowired
    ModelMapper mapper;

    public Order createOrder(OrderDTO orderDto) {
        //validations on order
        OrderValidator validator;
        //validator.validate(orderDto);
        Order order = covertDtoToEntity(orderDto);
        return orderService.createOrder(order);
    }

    private Order covertDtoToEntity(OrderDTO order) {
        return mapper.map(order, Order.class);
    }

    private void validate(OrderDTO orderDTO) {

    }
}
