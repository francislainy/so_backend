package com.francislainy.so.backend.controller.question;

import com.francislainy.so.backend.dto.QuestionCreateDto;
import com.francislainy.so.backend.service.QuestionCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin
@RequestMapping(method = RequestMethod.POST, value = "/api/so/questions")
@RestController
public class QuestionCommandController {

    @Autowired
    private QuestionCommandService questionCommandService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<QuestionCreateDto> createQuestion(@RequestBody QuestionCreateDto questionCreateDto) {
        return new ResponseEntity<>(questionCommandService.createQuestion(questionCreateDto), HttpStatus.CREATED);
    }

    @PostMapping(value = "/{id}/vote/{voteType}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<QuestionCreateDto> upvoteQuestion(@PathVariable(value = "id") UUID id, @PathVariable(value = "voteType") Integer voteType) {

        return new ResponseEntity<>(questionCommandService.voteQuestion(id, voteType), HttpStatus.OK);
    }

}
