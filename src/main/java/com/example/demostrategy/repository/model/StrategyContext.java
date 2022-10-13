package com.example.demostrategy.repository.model;

import com.example.demostrategy.repository.PaymentStrategy;
import com.example.demostrategy.repository.model.bank.BankName;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Component
@AllArgsConstructor
public class StrategyContext implements InitializingBean {

    private final List<PaymentStrategy> paymentStrategyList;
    private Map<BankName, PaymentStrategy> strategyMap;

    @Override
    public void afterPropertiesSet() {
        this.strategyMap = new EnumMap<>(BankName.class);
        paymentStrategyList.forEach((PaymentStrategy paymentStrategy)
                -> strategyMap.put(paymentStrategy.getBankName(), paymentStrategy));
    }


    public ShoppingCartEntity paidTest(ShoppingCartEntity entity) {
        var getName = strategyMap.get(entity.getBankName());
        var totalVar = getName.pay(entity.getValue());
        entity.setValue(totalVar);

        return entity;
    }
}
