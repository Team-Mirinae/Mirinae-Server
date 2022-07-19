package com.project.mirinae.domain.restaurant.service;

import com.project.mirinae.domain.restaurant.entity.Restaurant;
import com.project.mirinae.domain.restaurant.exception.RestaurantNotFoundException;
import com.project.mirinae.domain.restaurant.presentation.dto.response.CoordinateResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantDataResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantSearchDetailedResponse;
import com.project.mirinae.domain.restaurant.repository.RestaurantRepository;
import com.project.mirinae.domain.user.presentation.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantSearchService {

    private final Logger log = LoggerFactory.getLogger(RestaurantSearchService.class);
    private final RestaurantRepository restaurantRepository;

    public RestaurantSearchDetailedResponse execute(String title) {

        Restaurant found = restaurantRepository.findByTitle(title)
                .orElseThrow(() -> RestaurantNotFoundException.EXCEPTION);

        UserResponse user = UserResponse.builder()
                .userId(found.getUser().getUserId())
                .name(found.getUser().getName())
                .build();

        RestaurantDataResponse data = RestaurantDataResponse.builder()
                .title(found.getTitle())
                .content(found.getContent())
                .coordinate(CoordinateResponse.builder()
                        .longitude(found.getLongitude())
                        .latitude(found.getLatitude())
                        .build())
                .build();

        log.info("restaurantSearch Success!!");

        return RestaurantSearchDetailedResponse.builder()
                .restaurantData(data)
                .build();
    }

}
