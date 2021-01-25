package com.francislainy.so.backend.repository.answer;

import com.francislainy.so.backend.entity.answer.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnswerRepository extends JpaRepository<AnswerEntity, UUID> {
}
