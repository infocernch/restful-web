package com.example.restfulwebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//AOP -> 로깅, 로그인, 메시지추가 등의 비즈니스로직에서
//항상 실행시켜줘야하는 로직이 있다면 aop..?
@Data
@AllArgsConstructor //모든 매개변수가 있는 생성자
@NoArgsConstructor// 기본 생성자
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;
}
