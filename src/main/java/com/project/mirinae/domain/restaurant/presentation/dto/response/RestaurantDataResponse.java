package com.project.mirinae.domain.restaurant.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantDataResponse {

    private String title;

    private String content;

    private CoordinateResponse coordinate;

}
