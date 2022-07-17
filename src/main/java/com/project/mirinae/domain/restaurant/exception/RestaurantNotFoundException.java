package com.project.mirinae.domain.restaurant.exception;

import com.project.mirinae.global.exception.BusinessException;
import org.springframework.http.HttpStatus;

public class RestaurantNotFoundException extends BusinessException {

    public static final RestaurantNotFoundException EXCEPTION = new RestaurantNotFoundException();

    private RestaurantNotFoundException() {
        super(HttpStatus.NOT_FOUND, "제목이 없어요..");
    }
}
