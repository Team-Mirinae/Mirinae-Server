package com.project.mirinae.domain.user.service;

import com.project.mirinae.domain.user.entity.User;
import com.project.mirinae.domain.user.exception.UserNotFoundException;
import com.project.mirinae.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserDeleteService {

    private final Logger log = LoggerFactory.getLogger(UserDeleteService.class);
    private final UserRepository userRepository;

    @Transactional
    public void execute(String userId) {
        System.out.println(userId);
        User deleteUser = userRepository.findByUserId(userId)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);

        userRepository.delete(deleteUser);

        log.info("userDelete Success!!");
    }

}
