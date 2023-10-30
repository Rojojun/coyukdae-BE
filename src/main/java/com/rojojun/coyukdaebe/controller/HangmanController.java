package com.rojojun.coyukdaebe.controller;

import com.rojojun.coyukdaebe.common.ApiResponse;
import com.rojojun.coyukdaebe.dto.QuestionMakerRequestDto;
import com.rojojun.coyukdaebe.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController("/games/hangman")
public class HangmanController {
    private final QuestionService questionService;

    @PostMapping("/questions")
    public ApiResponse createQuestions(@RequestBody QuestionMakerRequestDto requestDto) {
        return ApiResponse.success(questionService.createQuestionInfo(requestDto));
    }

    @GetMapping("/question/{questionId}")
    public ApiResponse getQuestion(@PathVariable Long questionId) {
        return ApiResponse.success(questionService.readQuestion(questionId));
    }
}
