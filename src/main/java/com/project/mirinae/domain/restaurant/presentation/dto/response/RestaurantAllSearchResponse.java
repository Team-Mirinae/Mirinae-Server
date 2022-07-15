package com.project.mirinae.domain.restaurant.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.*;

@Getter @AllArgsConstructor
@Builder
public class RestaurantAllSearchResponse {

    private List<RestaurantDataResponse> list;

}
