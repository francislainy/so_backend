package com.francislainy.so.backend.service.impl;


import com.francislainy.so.backend.dto.QuestionCreateDto;
import com.francislainy.so.backend.entity.QuestionEntity;
import com.francislainy.so.backend.repository.QuestionRepository;
import com.francislainy.so.backend.service.QuestionCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

@Service
public class QuestionCommandServiceImpl implements QuestionCommandService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public QuestionCreateDto createQuestion(QuestionCreateDto questionCreateDto) {

        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setId(UUID.randomUUID());
        questionEntity.setTitle(questionCreateDto.getTitle());

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Dublin")) ;
        Timestamp timestamp = Timestamp.valueOf(zdt.toLocalDateTime());

        questionEntity.setCreationDate(timestamp.getTime());

        questionRepository.save(questionEntity);

        return new QuestionCreateDto(questionEntity.getId(), questionEntity.getTitle(), questionEntity.getCreationDate());

    }
}
