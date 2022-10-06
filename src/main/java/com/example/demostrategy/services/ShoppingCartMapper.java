package com.example.demostrategy.services;

import com.example.demostrategy.repository.model.ShoppingCartEntity;
import com.example.demostrategy.repository.model.request.ShoppingCartRequest;
import com.example.demostrategy.repository.model.response.ShoppingCartResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShoppingCartMapper {
    static ShoppingCartResponse mapFromResponse(ShoppingCartEntity entity) {
        return Mappers.getMapper(ShoppingCartMapper.class).mapToResponse(entity);
    }

    static ShoppingCartEntity mapToEntity(ShoppingCartRequest request) {
        return Mappers.getMapper(ShoppingCartMapper.class).mapEntityToRequest(request);
    }

    ShoppingCartResponse mapToResponse(ShoppingCartEntity entity);

    ShoppingCartEntity mapEntityToRequest(ShoppingCartRequest request);
}
