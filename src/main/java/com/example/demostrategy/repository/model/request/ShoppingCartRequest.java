package com.example.demostrategy.repository.model.request;

import com.example.demostrategy.repository.model.bank.BankName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartRequest {
    private String id;
    private String costumer;
    private String products;
    private BankName bankName;
    private Double value;
}
