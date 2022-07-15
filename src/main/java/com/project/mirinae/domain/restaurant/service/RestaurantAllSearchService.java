package com.project.mirinae.domain.restaurant.service;

import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantAllSearchResponse;
import com.project.mirinae.domain.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantAllSearchService {

    private final RestaurantRepository repository;

    public RestaurantAllSearchResponse execute() {
        return null;
    }

}
