package com.project.mirinae.domain.restaurant.service;

import com.project.mirinae.domain.restaurant.entity.Restaurant;
import com.project.mirinae.domain.restaurant.exception.RestaurantNotFoundException;
import com.project.mirinae.domain.restaurant.presentation.dto.request.RestaurantDeleteRequest;
import com.project.mirinae.domain.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantDeleteService {

    private final RestaurantRepository restaurantRepository;

    public void execute(RestaurantDeleteRequest request) {

        Restaurant found = restaurantRepository.findByTitle(request.getTitle())
                .orElseThrow(() -> RestaurantNotFoundException.EXCEPTION);

        restaurantRepository.delete(found);

    }

}
