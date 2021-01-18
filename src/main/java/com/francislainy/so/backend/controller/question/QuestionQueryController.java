package com.francislainy.so.backend.controller.question;

import com.francislainy.so.backend.dto.QuestionQueryDto;
import com.francislainy.so.backend.service.QuestionQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RequestMapping("/api/so/questions")
@RestController
public class QuestionQueryController {

    @Autowired
    private QuestionQueryService questionQueryService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Map<String, List<QuestionQueryDto>> getAllQuestions() {

        Map result = new HashMap();
        result.put("questions", questionQueryService.getQuestionList());
        return result;

    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<QuestionQueryDto> getQuestionItem(@PathVariable(value = "id") UUID id) {

        return new ResponseEntity<>(questionQueryService.getQuestionItem(id), HttpStatus.OK);

    }

}
