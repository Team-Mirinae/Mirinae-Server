package com.project.mirinae.domain.restaurant.service;

import com.project.mirinae.domain.restaurant.presentation.dto.request.RestaurantSaveRequest;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantSaveResponse;
import com.project.mirinae.domain.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantSaveService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantSaveResponse execute(RestaurantSaveRequest request) {

        return null;
    }

}
