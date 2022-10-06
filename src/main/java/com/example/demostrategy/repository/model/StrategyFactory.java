package com.example.demostrategy.repository.model;

import com.example.demostrategy.repository.PaymentStrategy;
import com.example.demostrategy.repository.model.request.ShoppingCartRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Component
@AllArgsConstructor
public class StrategyFactory implements InitializingBean {

    private final List<PaymentStrategy> paymentStrategyList;
    private Map<BankName, PaymentStrategy> strategyMap;


//    @Autowired
//    public StrategyFactory(Set<PaymentStrategy> strategySet) {
//        createStrategy(strategySet);
//    }
//
//    public PaymentStrategy findStrategy(BankName strategyName) {
//        return strategyMap.get(strategyName);
//    }
//
//    private void createStrategy(Set<PaymentStrategy> strategySet) {
//        strategyMap = new HashMap<BankName, PaymentStrategy>();
//        strategySet.forEach(
//                strategy ->strategyMap.put(strategy.getBankName(), strategy));
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.strategyMap = new EnumMap<>(BankName.class);
        paymentStrategyList.forEach((PaymentStrategy paymentStrategy)
                -> strategyMap.put(paymentStrategy.getBankName(), paymentStrategy));
    }


    public ShoppingCartEntity paidTest(ShoppingCartEntity entity){
        var teste = strategyMap.get(entity.getBankName());

        var totalVar = teste.pay(entity.getTotal());

        entity.setTotal(totalVar);

        return entity;
    }
}
