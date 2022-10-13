package com.example.demostrategy.repository;

import com.example.demostrategy.repository.model.bank.BankName;

public interface PaymentStrategy {

    BankName getBankName();

    Double pay(Double amount);
}
