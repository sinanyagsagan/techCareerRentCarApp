package com.sinanyagsagan.assignment.model;

import com.sinanyagsagan.assignment.enums.CustomerType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    private CustomerType customerType;

}
