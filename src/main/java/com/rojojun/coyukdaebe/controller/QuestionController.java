package com.rojojun.coyukdaebe.controller;

import com.rojojun.coyukdaebe.common.ApiResponse;
import com.rojojun.coyukdaebe.dto.QuestionMakerRequestDto;
import com.rojojun.coyukdaebe.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping("/games/hangman/questions")
    public ApiResponse createQuestions(@RequestBody QuestionMakerRequestDto requestDto) {
        return ApiResponse.success(questionService.createQuestionInfo(requestDto));
    }
}
