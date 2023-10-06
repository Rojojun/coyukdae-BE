package com.rojojun.coyukdaebe.repository;

import com.rojojun.coyukdaebe.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Questions, Long> {
}
