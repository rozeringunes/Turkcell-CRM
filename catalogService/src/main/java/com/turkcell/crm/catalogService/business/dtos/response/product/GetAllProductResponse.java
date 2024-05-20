package com.turkcell.crm.catalogService.business.dtos.response.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProductResponse {

    private String name;
    private String description;
    private double price;
    private int unitInStock;
}