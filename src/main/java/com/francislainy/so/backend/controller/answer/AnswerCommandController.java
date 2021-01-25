package com.francislainy.so.backend.controller.answer;

import com.francislainy.so.backend.dto.answer.AnswerCreateDto;
import com.francislainy.so.backend.service.answer.AnswerCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin
@RequestMapping(method = RequestMethod.POST, value = "/api/so/questions")
@RestController
public class AnswerCommandController {

    @Autowired
    private AnswerCommandService answerCommandService;

    @PostMapping(value = "/{questionId}/answers", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<AnswerCreateDto> createAnswer(@RequestHeader(required = false, value = "authorization") UUID userId, @PathVariable(value = "questionId") UUID questionId, @RequestBody AnswerCreateDto answerCreateDto) {

        if (userId == null) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        } else {
            return new ResponseEntity<>(answerCommandService.createAnswer(userId, questionId, answerCreateDto), HttpStatus.CREATED);
        }
    }

}