package com.project.mirinae.domain.user.presentation;

import com.project.mirinae.domain.user.presentation.dto.request.UserSignUpRequest;
import com.project.mirinae.domain.user.presentation.dto.response.UserResponse;
import com.project.mirinae.domain.user.service.UserSignUpService;
import com.project.mirinae.domain.user.service.UserLoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserSignUpService userSignUpService;
    private final UserLoginService userLoginService;

    @PostMapping("/signUp")
    public UserResponse userSignUp(@RequestBody UserSignUpRequest request) {
        return userSignUpService.execute(request);
    }

}
