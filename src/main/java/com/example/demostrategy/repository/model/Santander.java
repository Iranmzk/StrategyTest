package com.example.demostrategy.repository.model;

import com.example.demostrategy.repository.PaymentStrategy;
import org.springframework.stereotype.Component;

@Component
public class Santander implements PaymentStrategy {

    @Override
    public Double pay(Double amount) {
        return 1.30 * amount;
    }

    @Override
    public BankName getBankName() {
        return BankName.SANTANDER;
    }
}
