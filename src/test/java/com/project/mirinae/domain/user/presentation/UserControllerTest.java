package com.project.mirinae.domain.user.presentation;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserControllerTest {

    @Test
    @DisplayName("UserSignUp Test")
    @Order(0)
    void userSignUp() {

        System.out.println("UserSignUp Test");

    }

    @Test
    @DisplayName("UserSignIn Test")
    @Order(1)
    void userSignIn() {

        System.out.println("UserSignIn Test");

    }

    @Test
    @DisplayName("UserDelete Test")
    @Order(2)
    void userDelete() {

        System.out.println("UserDelete Test");

    }
}