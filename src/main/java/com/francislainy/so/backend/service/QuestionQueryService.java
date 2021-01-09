package com.francislainy.so.backend.service;

import com.francislainy.so.backend.dto.QuestionQueryDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface QuestionQueryService {

    QuestionQueryDto getQuestionItem(UUID id);

    List<QuestionQueryDto> getQuestionList();
}
