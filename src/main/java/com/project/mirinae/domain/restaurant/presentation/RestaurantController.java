package com.project.mirinae.domain.restaurant.presentation;

import com.project.mirinae.domain.restaurant.presentation.dto.request.RestaurantDeleteRequest;
import com.project.mirinae.domain.restaurant.presentation.dto.request.RestaurantSaveRequest;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantAllSearchResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantDeleteResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantSaveResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantSearchDetailedResponse;
import com.project.mirinae.domain.restaurant.service.RestaurantAllSearchService;
import com.project.mirinae.domain.restaurant.service.RestaurantDeleteService;
import com.project.mirinae.domain.restaurant.service.RestaurantSaveService;
import com.project.mirinae.domain.restaurant.service.RestaurantSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/restaurant")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantSaveService restaurantSaveService;
    private final RestaurantAllSearchService restaurantAllSearchService;
    private final RestaurantSearchService restaurantSearchService;
    private final RestaurantDeleteService restaurantDeleteService;

    @PostMapping("/save")
    public RestaurantSaveResponse restaurantSave(@RequestBody RestaurantSaveRequest request) {
        return restaurantSaveService.execute(request);
    }

    @GetMapping("/allsearch")
    public RestaurantAllSearchResponse restaurantAllSearch(@PathVariable String userId) {
        return null;
    }

    @GetMapping("/search")
    public RestaurantSearchDetailedResponse restaurantSearch() {
        return null;
    }

    @DeleteMapping("/delete")
    public RestaurantDeleteResponse restaurantDelete(@PathVariable String userId, @RequestBody RestaurantDeleteRequest request) {
        return null;
    }

}
