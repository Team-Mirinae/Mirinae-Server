package com.project.mirinae.domain.restaurant.service;

import com.project.mirinae.domain.restaurant.exception.RestaurantAlredyExistsByTitleException;
import com.project.mirinae.domain.restaurant.presentation.dto.request.RestaurantSaveRequest;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantDataResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantSaveResponse;
import com.project.mirinae.domain.restaurant.repository.RestaurantRepository;
import com.project.mirinae.domain.user.entity.User;
import com.project.mirinae.domain.user.presentation.dto.response.UserResponse;
import com.project.mirinae.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantSaveService {

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

        RestaurantDataResponse restaurantData = RestaurantDataResponse.builder()
                .title(request.getTitle())
                .reason(request.getReason())
                .coordinate(request.getCoordinate())
                .userData(userData)
                .build();

        return RestaurantSaveResponse.builder()
                .restaurantData(restaurantData)
                .build();
    }

}
