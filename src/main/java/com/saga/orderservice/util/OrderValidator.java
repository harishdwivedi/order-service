package com.saga.orderservice.util;

import com.saga.orderservice.dto.OrderDTO;
import com.saga.orderservice.exception.ValidationException;
import lombok.Builder;

import java.util.Objects;

@Builder
public class OrderValidator {
    OrderValidator validate;
   public void validate(OrderDTO orderDTO) throws Exception {
        if(Objects.isNull(orderDTO.getAddress()))
            throw new ValidationException("Address is null");
    }
}
