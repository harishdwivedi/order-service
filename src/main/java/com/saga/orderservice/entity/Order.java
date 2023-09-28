package com.saga.orderservice.entity;

import lombok.*;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "order")
public class Order implements Serializable {
    @Id
    Long orderId;
    Date orderDate;
    Address address;
    String status;
    List<OrderLineItem> orderLineItems;

}
