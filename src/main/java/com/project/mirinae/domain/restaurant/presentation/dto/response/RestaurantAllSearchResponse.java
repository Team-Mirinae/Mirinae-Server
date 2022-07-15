package com.project.mirinae.domain.restaurant.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.*;

@Getter @AllArgsConstructor
@Builder
public class RestaurantAllSearchResponse {

    private HttpStatus status;

    private String msg;

    private LinkedList<RestaurantListResponse> list;

}
