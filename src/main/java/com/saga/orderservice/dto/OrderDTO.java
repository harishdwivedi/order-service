package com.saga.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Data
public class OrderDTO {
    UUID orderId;
    Date orderDate;
    AddressDTO address;
    String status;
    List<OrderLineItemDTO> orderLineItemDTOList;
}
