package com.project.mirinae.domain.restaurant.service;

import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantSearchDetailedResponse;
import com.project.mirinae.domain.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantSearchService {

    private final RestaurantRepository repository;

    public RestaurantSearchDetailedResponse execute() {
        return null;
    }

}
