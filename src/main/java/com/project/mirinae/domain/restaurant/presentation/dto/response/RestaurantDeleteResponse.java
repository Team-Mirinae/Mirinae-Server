package com.project.mirinae.domain.restaurant.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter @AllArgsConstructor
@Builder
public class RestaurantDeleteResponse {

    private HttpStatus status;

    private String msg;

}
