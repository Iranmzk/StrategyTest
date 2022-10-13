package com.example.demostrategy.controller;

import com.example.demostrategy.repository.model.request.ShoppingCartRequest;
import com.example.demostrategy.repository.model.response.ShoppingCartResponse;
import com.example.demostrategy.services.ShoppingCartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopping")
@AllArgsConstructor
public class ShoppingCartController {
    private ShoppingCartService shoppingCartService;

    @PostMapping("/cart")
    public ShoppingCartResponse save(@RequestBody ShoppingCartRequest request) {
        return shoppingCartService.saveSc(request);
    }

    @GetMapping("/find")
    public ShoppingCartResponse find(@RequestParam String id) {
        return shoppingCartService.find(id);
    }
}
