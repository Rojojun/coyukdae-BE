package com.rojojun.coyukdaebe.dto;

import com.rojojun.coyukdaebe.entity.QuestionLevel;
import com.rojojun.coyukdaebe.entity.QuestionType;

public record QuestionResponseDto(
        String nickname,
        QuestionLevel questionLevel,
        Integer questionNo,
        Integer score,
        Integer life,
        QuestionType theme,
        String answer
        ) {
}
