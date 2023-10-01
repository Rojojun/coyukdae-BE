package com.rojojun.coyukdaebe.entity;

import com.rojojun.coyukdaebe.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class QuestionInfo extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private QuestionLevel questionLevel;

    @Enumerated(EnumType.STRING)
    private QuestionType questionType;

    private String nickname;

    public static QuestionInfo of(QuestionLevel questionLevel, QuestionType questionType, String nickname) {
        return new QuestionInfo(questionLevel, questionType, nickname);
    }
}
