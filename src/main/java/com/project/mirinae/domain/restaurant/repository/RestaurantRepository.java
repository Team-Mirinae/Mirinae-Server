package com.project.mirinae.domain.restaurant.repository;

import com.project.mirinae.domain.restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, String> {

}
