package com.example.demostrategy.repository.model;

import com.example.demostrategy.repository.PaymentStrategy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartEntity {
    @Id
    private String id;
    private String costumer;
    private List<Products> productsList;
    private BankName bankName;
    private Double total;

}
