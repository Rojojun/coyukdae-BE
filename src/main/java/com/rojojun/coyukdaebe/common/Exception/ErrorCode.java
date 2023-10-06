package com.rojojun.coyukdaebe.common.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    LOGIN_INVALID("로그인 정보가 잘못되었습니다.", 100),
    PASSWORD_INVALID("비밀번호가 잘못되었습니다.", 101),
    QUESTION_INFO_UNKNOWN("문제 정보가 잘못되었습니다.", 400);

    private final String message;
    private final int code;
}
