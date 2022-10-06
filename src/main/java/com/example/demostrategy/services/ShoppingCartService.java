package com.example.demostrategy.services;

import com.example.demostrategy.repository.ShoppingCartRepository;
import com.example.demostrategy.repository.model.request.ShoppingCartRequest;
import com.example.demostrategy.repository.model.response.ShoppingCartResponse;
import com.example.demostrategy.repository.model.StrategyFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ShoppingCartService {

    private final ShoppingCartRepository repository;

    private final StrategyFactory strategyFactory;

    public ShoppingCartResponse saveSc(ShoppingCartRequest request) {
        return ShoppingCartMapper.mapFromResponse(repository.save(ShoppingCartMapper.mapToEntity(request)));
    }

    public ShoppingCartResponse findById(String id) {
        return repository.findById(id)
                .map(ShoppingCartMapper::mapFromResponse)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }

    public ShoppingCartResponse test(ShoppingCartRequest request) {
        var variavel = strategyFactory.paidTest(ShoppingCartMapper.mapToEntity(request));

        return ShoppingCartMapper.mapFromResponse(variavel);
    }
}
