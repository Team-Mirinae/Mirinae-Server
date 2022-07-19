package com.project.mirinae.domain.restaurant.service;

import com.project.mirinae.domain.restaurant.entity.Restaurant;
import com.project.mirinae.domain.restaurant.exception.RestaurantAlredyExistsByTitleException;
import com.project.mirinae.domain.restaurant.presentation.dto.request.RestaurantSaveRequest;
import com.project.mirinae.domain.restaurant.presentation.dto.response.CoordinateResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantDataResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantSaveResponse;
import com.project.mirinae.domain.restaurant.repository.RestaurantRepository;
import com.project.mirinae.domain.user.entity.User;
import com.project.mirinae.domain.user.presentation.dto.response.UserResponse;
import com.project.mirinae.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantSaveService {

    private final Logger log = LoggerFactory.getLogger(RestaurantSaveService.class);
    private final RestaurantRepository restaurantRepository;
    private final UserRepository userRepository;

    public RestaurantSaveResponse execute(RestaurantSaveRequest request, String userId) {

        restaurantRepository.findByTitle(request.getTitle())
                .ifPresent(m -> {
                    throw RestaurantAlredyExistsByTitleException.EXCEPTION;
                });

        User user = userRepository.getReferenceByUserId(userId);

        UserResponse userData = UserResponse.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .build();

        Restaurant restaurant = Restaurant.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .latitude(request.getLatitude())
                .longitude(request.getLongitude())
                .user(user)
                .build();

        restaurantRepository.save(restaurant);

        RestaurantDataResponse restaurantData = RestaurantDataResponse.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .coordinate(CoordinateResponse.builder()
                        .latitude(request.getLatitude())
                        .longitude(request.getLongitude())
                        .build())
                .build();

        log.info("RestaurantSave Success!!");

        return RestaurantSaveResponse.builder()
                .restaurantData(restaurantData)
                .build();
    }

}
