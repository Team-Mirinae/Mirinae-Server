package com.project.mirinae.domain.restaurant.presentation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter @AllArgsConstructor
@Builder
public class RestaurantSearchRequest {

    private String title;

}
