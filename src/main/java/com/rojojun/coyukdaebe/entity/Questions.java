package com.rojojun.coyukdaebe.entity;

import com.rojojun.coyukdaebe.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;

@Entity
public class Questions extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(name = "question_level")
    private QuestionLevel questionLevel;

    @Enumerated(EnumType.STRING)
    @Column(name = "question_type")
    private QuestionType questionType;

    @NotNull
    private String description;

    @NotNull
    private String answer;
}
