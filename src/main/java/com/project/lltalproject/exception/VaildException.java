package com.project.lltalproject.exception;

import lombok.Getter;

import java.util.Map;

public class VaildException extends RuntimeException {

    @Getter

    Map<String, String> errorMap;

    public VaildException(Map<String, String> errorMap) {
        super("유효성 검사 오류");
        this.errorMap = errorMap;
    }
}
