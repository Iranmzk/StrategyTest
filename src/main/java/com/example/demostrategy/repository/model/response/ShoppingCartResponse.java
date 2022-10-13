package com.example.demostrategy.repository.model.response;

import com.example.demostrategy.repository.model.BankName;
import com.example.demostrategy.repository.model.Products;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartResponse {
    private String id;
    private String costumer;
    private String products;
    private BankName bankName;
    private Double value;
}
