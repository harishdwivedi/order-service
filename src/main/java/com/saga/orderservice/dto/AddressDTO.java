package com.saga.orderservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDTO {
    String building;
    String street;
    String county;
    String postalCode;
    String country;

}
