package com.example.demostrategy.repository.model.request;

import com.example.demostrategy.repository.model.BankName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartRequest {
    //    private String id;
//    private List<Products> products;
    private BankName bankName;
    private Double total;
}
