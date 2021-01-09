package com.francislainy.so.backend.service;

import com.francislainy.so.backend.dto.QuestionCreateDto;
import org.springframework.stereotype.Service;

@Service
public interface QuestionCommandService {

    QuestionCreateDto createQuestion(QuestionCreateDto questionCreateDto);

}
