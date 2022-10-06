package com.example.demostrategy.repository.model.response;

import com.example.demostrategy.repository.model.Products;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartResponse {
    private String id;
    private List<Products> products;
    private double total;
}
