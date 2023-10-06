package com.rojojun.coyukdaebe.repository;

import com.rojojun.coyukdaebe.entity.QuestionLevel;
import com.rojojun.coyukdaebe.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Questions, Long> {
    List<Questions> findAllByQuestionLevel(QuestionLevel questionLevel);
}
