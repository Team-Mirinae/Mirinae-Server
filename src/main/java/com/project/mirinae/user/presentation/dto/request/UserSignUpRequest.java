package com.project.mirinae.user.presentation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter @AllArgsConstructor
@Builder
public class UserSignUpRequest {

    @NonNull
    private String id;

    @NonNull
    private String pw;

    @NonNull
    private String name;

}
