package com.project.mirinae.user.presentation;

import com.project.mirinae.user.service.UserLoginService;
import com.project.mirinae.user.service.UserSignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserSignUpService userSignUpService;
    private final UserLoginService userLoginService;

}
