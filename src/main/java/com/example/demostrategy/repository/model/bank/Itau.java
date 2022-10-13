package com.example.demostrategy.repository.model.bank;

import com.example.demostrategy.repository.PaymentStrategy;
import org.springframework.stereotype.Component;

@Component
public class Itau implements PaymentStrategy {

    @Override
    public BankName getBankName() {
        return BankName.ITAU;
    }

    @Override
    public Double pay(Double amount) {
        return 1.10 * amount;
    }
}

