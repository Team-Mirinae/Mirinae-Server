package com.project.mirinae.domain.user.presentation;

import com.project.mirinae.domain.user.presentation.dto.request.UserSignInRequest;
import com.project.mirinae.domain.user.presentation.dto.request.UserSignUpRequest;
import com.project.mirinae.domain.user.presentation.dto.response.UserSignInResponse;
import com.project.mirinae.domain.user.presentation.dto.response.UserSignUpResponse;
import com.project.mirinae.domain.user.service.UserSignUpService;
import com.project.mirinae.domain.user.service.UserSignInService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

    private final Logger log = LoggerFactory.getLogger(UserController.class);
    private final UserSignUpService userSignUpService;
    private final UserSignInService userLoginService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/sign-up")
    public UserSignUpResponse userSignUp(
            @RequestBody UserSignUpRequest request
    ) {
        return userSignUpService.execute(request);
    }

    @PostMapping("/sign-in")
    public UserSignInResponse userSignIn(
            @RequestBody UserSignInRequest request
    ) {
        return userLoginService.execute(request);
    }

<<<<<<< HEAD
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{userId}")
    public void userDelete(
            @PathVariable("userId") String userId
    ) {
        userDeleteService.execute(userId);
    }

=======
>>>>>>> 0bb7fcfc70679cf25c7021ac545170a3aa3de2f8
}
