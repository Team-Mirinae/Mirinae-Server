package com.project.mirinae.domain.restaurant.exception;

import com.project.mirinae.global.exception.BusinessException;
import org.springframework.http.HttpStatus;

public class RestaurantAlredyExistsByTitleException extends BusinessException {

    public static final RestaurantAlredyExistsByTitleException EXCEPTION = new RestaurantAlredyExistsByTitleException();

    private RestaurantAlredyExistsByTitleException() {
        super(HttpStatus.CONFLICT, "이 맛집 이미 저장함");
    }
}
