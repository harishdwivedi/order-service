package com.saga.orderservice.entity;

import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="address")
public class Address implements Serializable {
    String building;
    String street;
    String county;
    String postalCode;
    String country;

}
