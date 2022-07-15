package com.project.mirinae.domain.restaurant.service;

import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantDeleteResponse;
import com.project.mirinae.domain.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantDeleteService {

    private final RestaurantRepository repository;

    public RestaurantDeleteResponse execute() {

        return null;
    }

}
