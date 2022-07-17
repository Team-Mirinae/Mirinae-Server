package com.project.mirinae.domain.restaurant.service;

import com.project.mirinae.domain.restaurant.entity.Restaurant;
import com.project.mirinae.domain.restaurant.presentation.dto.response.CoordinateResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantAllSearchResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantDataResponse;
import com.project.mirinae.domain.restaurant.repository.RestaurantRepository;
import com.project.mirinae.domain.user.entity.User;
import com.project.mirinae.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RestaurantAllSearchService {

    private final RestaurantRepository restaurantRepository;
    private final UserRepository userRepository;

    public RestaurantAllSearchResponse execute(String userId) {

        User user = userRepository.getReferenceByUserId(userId);

        List<Restaurant> found = restaurantRepository.findAllByUser(user);

        List<RestaurantDataResponse> list = found.stream().map(it -> RestaurantDataResponse.builder()
                .title(it.getTitle())
                .content(it.getContent())
                .coordinate(CoordinateResponse.builder()
                        .longitude(it.getLongitude())
                        .latitude(it.getLatitude())
                        .build())
                .build()
        ).collect(Collectors.toList());

        return RestaurantAllSearchResponse.builder()
                .list(list)
                .build();
    }

}
