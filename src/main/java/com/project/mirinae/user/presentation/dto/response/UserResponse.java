package com.project.mirinae.user.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter @AllArgsConstructor
@Builder
public class UserResponse {

    private final String userId;

    private final String pw;

    private final String name;

}
