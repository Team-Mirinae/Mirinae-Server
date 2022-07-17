package com.project.mirinae.domain.restaurant.presentation.dto.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter @AllArgsConstructor
@Builder
public class RestaurantSaveRequest {

    @NotNull
    private String title;

    @NotNull
    private String content;

    @NotNull
    private double latitude;

    @NotNull
    private double longitude;

}
