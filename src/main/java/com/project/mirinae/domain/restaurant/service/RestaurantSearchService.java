package com.project.mirinae.domain.restaurant.service;

import com.project.mirinae.domain.restaurant.entity.Restaurant;
import com.project.mirinae.domain.restaurant.exception.RestaurantNotFoundException;
import com.project.mirinae.domain.restaurant.presentation.dto.request.RestaurantSearchRequest;
import com.project.mirinae.domain.restaurant.presentation.dto.response.CoordinateResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantDataResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantSearchDetailedResponse;
import com.project.mirinae.domain.restaurant.repository.RestaurantRepository;
import com.project.mirinae.domain.user.presentation.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantSearchService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantSearchDetailedResponse execute(RestaurantSearchRequest request) {

        Restaurant found = restaurantRepository.findByTitle(request.getTitle())
                .orElseThrow(() -> RestaurantNotFoundException.EXCEPTION);

        UserResponse user = UserResponse.builder()
                .userId(found.getUser().getUserId())
                .name(found.getUser().getName())
                .build();

        RestaurantDataResponse data = RestaurantDataResponse.builder()
                .title(found.getTitle())
                .reason(found.getReason())
                .coordinate(CoordinateResponse.builder()
                        .x(found.getX())
                        .y(found.getY())
                        .build())
                .userData(user)
                .build();

        return RestaurantSearchDetailedResponse.builder()
                .data(data)
                .build();
    }

}
