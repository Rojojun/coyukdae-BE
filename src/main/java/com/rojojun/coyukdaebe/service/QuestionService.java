package com.rojojun.coyukdaebe.service;

import com.rojojun.coyukdaebe.dto.QuestionMakerRequestDto;
import com.rojojun.coyukdaebe.dto.QuestionResponseDto;
import com.rojojun.coyukdaebe.entity.QuestionInfo;
import com.rojojun.coyukdaebe.repository.QuestionInfoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionInfoRepository questionInfoRepository;

    public QuestionInfo createQuestionInfo(QuestionMakerRequestDto questionMakerRequestDto) {
        return questionInfoRepository.save(questionMakerRequestDto.toEntity());
    }

    public QuestionResponseDto readQuestion(Long questionId) {
        return null;
    }
}
