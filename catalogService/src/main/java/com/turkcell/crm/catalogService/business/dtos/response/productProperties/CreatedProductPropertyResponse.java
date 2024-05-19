package com.turkcell.crm.catalogService.business.dtos.response.productProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedProductPropertyResponse {
    private int id;
    private int productId;
    private String key;
    private String value;
}
