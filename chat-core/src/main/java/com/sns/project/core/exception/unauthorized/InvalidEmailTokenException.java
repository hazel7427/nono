package com.sns.project.core.exception.unauthorized;

public class InvalidEmailTokenException extends RuntimeException {

    public InvalidEmailTokenException(String token) {
        super("유효하지 않은 토큰입니다: "+token);
    }
    
}
