package com.project.mirinae.domain.restaurant.repository;

import com.project.mirinae.domain.restaurant.entity.Restaurant;
import com.project.mirinae.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, String> {

    Optional<Restaurant> findByTitle(String title);

    Optional<Restaurant> findByUser(User user);

    List<Restaurant> findAllByUser(User user);

}
