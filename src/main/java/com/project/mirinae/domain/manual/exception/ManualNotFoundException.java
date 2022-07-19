package com.project.mirinae.domain.manual.exception;

import com.project.mirinae.global.exception.BusinessException;
import org.springframework.http.HttpStatus;

public class ManualNotFoundException extends BusinessException {

    public static final ManualNotFoundException EXCEPTION = new ManualNotFoundException();

    private ManualNotFoundException() {
        super(HttpStatus.NOT_FOUND, "제목을 찾지 못하였습니다");
    }
}
