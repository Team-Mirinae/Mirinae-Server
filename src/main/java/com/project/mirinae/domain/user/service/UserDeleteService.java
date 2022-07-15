package com.project.mirinae.domain.user.service;

import com.project.mirinae.domain.user.entity.User;
import com.project.mirinae.domain.user.exception.UserNotFoundException;
import com.project.mirinae.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDeleteService {

    private final UserRepository userRepository;

    public void execute(String userId) {

        userRepository.findByUserId(userId)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);

        User deleteUser = userRepository.getReferenceByUserId(userId);

        userRepository.delete(deleteUser);
    }

}
