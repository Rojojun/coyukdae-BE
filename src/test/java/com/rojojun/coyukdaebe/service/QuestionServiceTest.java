package com.rojojun.coyukdaebe.service;

import com.rojojun.coyukdaebe.dto.QuestionMakerRequestDto;
import com.rojojun.coyukdaebe.entity.QuestionInfo;
import com.rojojun.coyukdaebe.entity.QuestionLevel;
import com.rojojun.coyukdaebe.entity.QuestionType;
import com.rojojun.coyukdaebe.repository.QuestionInfoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


class QuestionServiceTest {

    @InjectMocks
    private QuestionService questionService;

    @Mock
    private QuestionInfoRepository questionInfoRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void QuestionInfo_만들기() {
        String nickname = "tester";
        QuestionMakerRequestDto requestDto = new QuestionMakerRequestDto(
                nickname, QuestionLevel.EASY, QuestionType.ANIMAL
        );
        QuestionInfo mockQuestionInfo = new QuestionInfo();
    }
}