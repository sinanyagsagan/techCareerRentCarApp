package com.sinanyagsagan.assignment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RentalFee {
    private double dailyPrice;
    private double monthlyPrice;
}
