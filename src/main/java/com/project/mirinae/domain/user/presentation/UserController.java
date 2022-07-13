package com.project.mirinae.domain.user.presentation;

import com.project.mirinae.domain.user.service.UserSignUpService;
import com.project.mirinae.domain.user.service.UserLoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserSignUpService userSignUpService;
    private final UserLoginService userLoginService;

}
