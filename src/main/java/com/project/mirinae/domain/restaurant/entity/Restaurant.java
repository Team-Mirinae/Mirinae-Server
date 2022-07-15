package com.project.mirinae.domain.restaurant.entity;

import com.project.mirinae.domain.restaurant.presentation.dto.response.CoordinateResponse;
import com.project.mirinae.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter @NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "restaurant")
public class Restaurant {

    @Id
    private String title;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "userId")
    private User user;

    private String reason;

    private CoordinateResponse coordinate;

    @Builder
    public Restaurant(String title, User user, String reason) {
        this.title = title;
        this.user = user;
        this.reason = reason;
    }
}
