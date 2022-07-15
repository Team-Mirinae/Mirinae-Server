package com.project.mirinae.domain.user.exception;

import com.project.mirinae.global.exception.BusinessException;
import org.springframework.http.HttpStatus;

public class UserAlreadyExistsByNameException extends BusinessException {

    public static final UserAlreadyExistsByNameException EXCEPTION = new UserAlreadyExistsByNameException();

    private UserAlreadyExistsByNameException() {
        super(HttpStatus.CONFLICT, "응 닉네임 이미 있어");
    }
}
