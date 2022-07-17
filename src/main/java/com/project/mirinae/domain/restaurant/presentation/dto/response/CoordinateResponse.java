package com.project.mirinae.domain.restaurant.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter @AllArgsConstructor
@Builder
public class CoordinateResponse {

    private double longitude;

    private double latitude;

}
