package com.example.demostrategy.repository.model;

import com.example.demostrategy.repository.PaymentStrategy;
import org.springframework.stereotype.Component;

@Component
public class Bradesco implements PaymentStrategy {
//    private String number;
//    private String ccv;

    @Override
    public Double pay(Double amount) {
        return 1.20 * amount;
    }

    @Override
    public BankName getBankName() {
        return BankName.BRADESCO;
    }
}
