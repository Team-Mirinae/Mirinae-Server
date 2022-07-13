package com.project.mirinae.user.service;

import com.project.mirinae.user.entity.User;
import com.project.mirinae.user.exception.UserAlreadyExistsException;
import com.project.mirinae.user.presentation.dto.request.UserSignUpRequest;
import com.project.mirinae.user.presentation.dto.response.UserResponse;
import com.project.mirinae.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserSignUpService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponse execute(UserSignUpRequest request) {

        userRepository.findByUserId(request.getId()).orElseThrow(() -> UserAlreadyExistsException.EXCEPTION);

        User user = User.builder()
                .userId(request.getId())
                .name(request.getName())
                .pw(request.getPw())
                .build();

        userRepository.save(user);

        return UserResponse.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .pw(user.getPw())
                .build();
    }

}
