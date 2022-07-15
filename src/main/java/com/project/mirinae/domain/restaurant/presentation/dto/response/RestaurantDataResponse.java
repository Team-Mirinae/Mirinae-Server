package com.project.mirinae.domain.restaurant.presentation.dto.response;

import com.project.mirinae.domain.user.presentation.dto.response.UserResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter @AllArgsConstructor
@Builder
public class RestaurantDataResponse {

    private String title;

    private String reason;

    private CoordinateResponse coordinate;

    private UserResponse userData;

}
