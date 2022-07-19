package com.project.mirinae.domain.restaurant.service;

import com.project.mirinae.domain.restaurant.entity.Restaurant;
import com.project.mirinae.domain.restaurant.exception.RestaurantNotFoundException;
import com.project.mirinae.domain.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantDeleteService {

    private final Logger log = LoggerFactory.getLogger(RestaurantDeleteService.class);
    private final RestaurantRepository restaurantRepository;

    public void execute(String title) {

        Restaurant found = restaurantRepository.findByTitle(title)
                .orElseThrow(() -> RestaurantNotFoundException.EXCEPTION);

        restaurantRepository.delete(found);

        log.info("restaurantDelete Success!!");
    }

}
