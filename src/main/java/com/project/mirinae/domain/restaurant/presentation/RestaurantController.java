package com.project.mirinae.domain.restaurant.presentation;

import com.project.mirinae.domain.restaurant.presentation.dto.request.RestaurantSaveRequest;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantAllSearchResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantSaveResponse;
import com.project.mirinae.domain.restaurant.presentation.dto.response.RestaurantSearchDetailedResponse;
import com.project.mirinae.domain.restaurant.service.RestaurantAllSearchService;
import com.project.mirinae.domain.restaurant.service.RestaurantDeleteService;
import com.project.mirinae.domain.restaurant.service.RestaurantSaveService;
import com.project.mirinae.domain.restaurant.service.RestaurantSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/restaurant")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantSaveService restaurantSaveService;
    private final RestaurantAllSearchService restaurantAllSearchService;
    private final RestaurantSearchService restaurantSearchService;
    private final RestaurantDeleteService restaurantDeleteService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save/{userId}")
    public RestaurantSaveResponse restaurantSave(
            @RequestBody RestaurantSaveRequest request,
            @PathVariable("userId") String userId
    ) {
        return restaurantSaveService.execute(request, userId);
    }

    @GetMapping("/favorite/{userId}")
    public RestaurantAllSearchResponse restaurantAllSearch(
            @PathVariable("userId") String userId
    ) {
        return restaurantAllSearchService.execute(userId);
    }

    @GetMapping("/search")
    public RestaurantSearchDetailedResponse restaurantSearch(
            @RequestParam String title
    ) {
        return restaurantSearchService.execute(title);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/favorite")
    public void restaurantDelete(
            @RequestParam String title
    ) {
        restaurantDeleteService.execute(title);
    }

}
