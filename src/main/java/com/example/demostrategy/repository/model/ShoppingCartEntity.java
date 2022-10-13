package com.example.demostrategy.repository.model;

import com.example.demostrategy.repository.model.bank.BankName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartEntity {
    @Id
    private String id;
    private String costumer;
    private String products;
    private BankName bankName;
    private Double value;

}
