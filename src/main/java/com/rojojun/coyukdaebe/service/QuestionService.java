package com.rojojun.coyukdaebe.service;

import com.rojojun.coyukdaebe.common.Exception.CustomException;
import com.rojojun.coyukdaebe.common.Exception.ErrorCode;
import com.rojojun.coyukdaebe.dto.QuestionMakerRequestDto;
import com.rojojun.coyukdaebe.entity.QuestionInfo;
import com.rojojun.coyukdaebe.entity.QuestionLevel;
import com.rojojun.coyukdaebe.entity.QuestionType;
import com.rojojun.coyukdaebe.entity.Questions;
import com.rojojun.coyukdaebe.repository.QuestionInfoRepository;
import com.rojojun.coyukdaebe.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionInfoRepository questionInfoRepository;
    private final QuestionRepository questionRepository;

    public QuestionInfo createQuestionInfo(QuestionMakerRequestDto questionMakerRequestDto) {
        return questionInfoRepository.save(questionMakerRequestDto.toEntity());
    }

    public List<Questions> readQuestion(Long questionId) {
        QuestionInfo questionInfo = questionInfoRepository.findById(questionId)
                .orElseThrow(() -> new CustomException(ErrorCode.QUESTION_INFO_UNKNOWN));

        QuestionType type = questionInfo.getQuestionType();
        QuestionLevel level = questionInfo.getQuestionLevel();

        List<Questions> questionsList = questionRepository.findAllByQuestionLevel(level);

        switch (type) {
            case RANDOM -> {
                List<Questions> shuffledQuestions = new ArrayList<>(questionsList);
                Collections.shuffle(shuffledQuestions);
                return shuffledQuestions.subList(0, Math.min(shuffledQuestions.size(), 3));
            }
            case JOB -> {
               return shuffleQuestionListByType(questionsList, QuestionType.JOB);
            }
            case PLANT -> {
                return shuffleQuestionListByType(questionsList, QuestionType.PLANT);
            }
            case ANIMAL -> {
                return shuffleQuestionListByType(questionsList, QuestionType.ANIMAL);
            }
            case EXERCISE -> {
                return shuffleQuestionListByType(questionsList, QuestionType.EXERCISE);
            }
            default -> {
                throw new CustomException(ErrorCode.QUESTION_INFO_UNKNOWN);
            }
        }
    }

    private List<Questions> shuffleQuestionListByType(List<Questions> questionsList, QuestionType type) {
        List<Questions> typeQuestionsList = new ArrayList<>(questionsList.stream()
                .filter(questions -> questions.getQuestionType() == type).toList());
        Collections.shuffle(typeQuestionsList);
        return typeQuestionsList.subList(0, Math.min(typeQuestionsList.size(), 3));

    }
}
