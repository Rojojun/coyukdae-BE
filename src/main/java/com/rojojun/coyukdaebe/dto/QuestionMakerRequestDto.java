package com.rojojun.coyukdaebe.dto;

import com.rojojun.coyukdaebe.entity.QuestionInfo;
import com.rojojun.coyukdaebe.entity.QuestionLevel;
import com.rojojun.coyukdaebe.entity.QuestionType;

public record QuestionMakerRequestDto(String nickname, QuestionLevel questionLevel, QuestionType questionType) {
    public QuestionInfo toEntity() {
        return QuestionInfo.of(questionLevel, questionType, nickname);
    }
}

