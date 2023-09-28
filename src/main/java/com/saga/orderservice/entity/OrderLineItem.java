package com.saga.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "order_line_item")
public class OrderLineItem {
    String productId;
    int quantity;
    double price;
    long order_line_id;
}
