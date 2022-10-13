package com.example.demostrategy.services;

import com.example.demostrategy.repository.ShoppingCartRepository;
import com.example.demostrategy.repository.model.request.ShoppingCartRequest;
import com.example.demostrategy.repository.model.response.ShoppingCartResponse;
import com.example.demostrategy.repository.model.StrategyContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ShoppingCartService {

    private final ShoppingCartRepository repository;
    private final StrategyContext strategyContext;

    public ShoppingCartResponse saveSc(ShoppingCartRequest request) {
        var context = strategyContext.paidTest(ShoppingCartMapper.RequestToEntity(request));
        var repo = repository.save(context);
        return ShoppingCartMapper.entityToResponse(repo);
    }

    public ShoppingCartResponse find(String id) {
        return repository.findById(id)
                .map(ShoppingCartMapper::entityToResponse)
                .orElseThrow(() -> new RuntimeException("not found"));
    }
}
