package com.rojojun.coyukdaebe.service;

import com.rojojun.coyukdaebe.dto.QuestionMakerRequestDto;
import com.rojojun.coyukdaebe.entity.QuestionInfo;
import com.rojojun.coyukdaebe.entity.QuestionLevel;
import com.rojojun.coyukdaebe.entity.QuestionType;
import com.rojojun.coyukdaebe.repository.QuestionInfoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
    public void 문제_만들기() {
        // given
        QuestionMakerRequestDto requestDto = new QuestionMakerRequestDto(
                "test", QuestionLevel.EASY, QuestionType.RANDOM
        );
        QuestionInfo mockQuestionInfo = requestDto.toEntity();
        when(questionService.createQuestionInfo(requestDto)).thenReturn(mockQuestionInfo);

        // when
        QuestionInfo createQuestionInfo = questionService.createQuestionInfo(requestDto);

        // then
        assertEquals(mockQuestionInfo, createQuestionInfo);
        verify(questionInfoRepository, times(1)).save(any(QuestionInfo.class));
    }
}