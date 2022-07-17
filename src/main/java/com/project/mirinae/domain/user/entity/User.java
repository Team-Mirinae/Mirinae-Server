package com.project.mirinae.domain.user.entity;

import com.project.mirinae.domain.restaurant.entity.Restaurant;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user")
public class User {

    @Id
    private String userId;

    private String pw;

    private String name;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL})
    private List<Restaurant> restaurants;

    @Builder
    public User(String userId, String pw, String name) {
        this.userId = userId;
        this.pw = pw;
        this.name = name;
    }

}
