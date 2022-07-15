package com.project.mirinae.domain.restaurant.presentation.dto.response;

import com.project.mirinae.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter @AllArgsConstructor
@Builder
public class RestaurantResponse {

    private User user;

    private String title;

    private String content;


}
