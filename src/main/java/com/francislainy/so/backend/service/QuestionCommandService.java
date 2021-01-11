package com.francislainy.so.backend.service;

import com.francislainy.so.backend.dto.QuestionCreateDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface QuestionCommandService {

    QuestionCreateDto createQuestion(QuestionCreateDto questionCreateDto);
    QuestionCreateDto voteQuestion(UUID questionId, Integer voteType);

}
