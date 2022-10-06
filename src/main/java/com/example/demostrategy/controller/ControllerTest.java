package com.example.demostrategy.controller;

import com.example.demostrategy.repository.model.request.ShoppingCartRequest;
import com.example.demostrategy.repository.model.response.ShoppingCartResponse;
import com.example.demostrategy.services.ShoppingCartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopping")
@AllArgsConstructor
public class ControllerTest {
    private ShoppingCartService shoppingCartService;

    @PostMapping("/create")
    public ShoppingCartResponse save(@RequestBody ShoppingCartRequest request) {
        return shoppingCartService.saveSc(request);
    }

    @GetMapping("/find")
    public ShoppingCartResponse find(@RequestBody ShoppingCartRequest request) {
        return shoppingCartService.test(request);
    }
}
