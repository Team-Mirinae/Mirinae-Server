package com.project.mirinae.domain.user.service;

import com.project.mirinae.domain.user.exception.UserAlreadyExistsByIdException;
import com.project.mirinae.domain.user.exception.UserAlreadyExistsByNameException;
import com.project.mirinae.domain.user.presentation.dto.response.UserResponse;
import com.project.mirinae.domain.user.entity.User;
import com.project.mirinae.domain.user.presentation.dto.request.UserSignUpRequest;
import com.project.mirinae.domain.user.presentation.dto.response.UserSignUpResponse;
import com.project.mirinae.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserSignUpService {

    private final UserRepository userRepository;

    @Transactional
    public UserSignUpResponse execute(UserSignUpRequest request) {
        userRepository.findByUserId(request.getId())
                .ifPresent(m -> {
                    throw UserAlreadyExistsByIdException.EXCEPTION;
                });
        userRepository.findByName(request.getName())
                .ifPresent(m -> {
                    throw UserAlreadyExistsByNameException.EXCEPTION;
                });

        User user = User.builder()
                .userId(request.getId())
                .name(request.getName())
                .pw(request.getPw())
                .build();
        user = userRepository.save(user);

        UserResponse userData = UserResponse.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .build();

        return UserSignUpResponse.builder()
                .userData(userData)
                .build();
    }

}
