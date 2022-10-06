package com.example.demostrategy.repository.model;

import com.example.demostrategy.repository.PaymentStrategy;
import org.springframework.stereotype.Component;

@Component
public class Itau implements PaymentStrategy {
//    private String number;
//    private String ccv;

    @Override
    public BankName getBankName() {
        return BankName.ITAU;
    }

    @Override
    public Double pay(Double amount) {
        return 1.10 * amount;
    }
}

