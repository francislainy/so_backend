package com.francislainy.so.backend.service.impl;

import com.francislainy.so.backend.dto.QuestionQueryDto;
import com.francislainy.so.backend.entity.QuestionEntity;
import com.francislainy.so.backend.repository.QuestionRepository;
import com.francislainy.so.backend.service.QuestionQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class QuestionQueryServiceImpl implements QuestionQueryService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public QuestionQueryDto getQuestionItem(UUID userId, UUID id) {

        if (questionRepository.findById(id).get().getUserEntity().getUser_id().equals(userId)) {

            if (questionRepository.findById(id).isPresent()) {
                QuestionEntity question = questionRepository.findById(id).get();

                return new QuestionQueryDto(question.getId(), question.getTitle(), question.getDescription(), question.getCreationDate(), question.getLastUpdated());

            } else {
                return null;
            }
        } else {
            return null; //todo: return 403 if not valid user
        }

    }

    @Override
    public List<QuestionQueryDto> getQuestionList(UUID userId) {

        List<QuestionQueryDto> questionList = new ArrayList<>();

        questionRepository.findAll().forEach(question -> {

            if (question.getUserEntity().getUser_id().equals(userId)) {

                questionList.add(new QuestionQueryDto(question.getId(), question.getTitle(), question.getDescription(), question.getCreationDate(), question.getLastUpdated()));

            }

        });

        return questionList; //todo: return 403 if not valid user
    }


}
