package com.francislainy.so.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuestionCreateDto {

    private UUID id;
    private String title;
    private Long creationDate;


    public QuestionCreateDto(String title, Long creationDate) {
        this.title = title;
        this.creationDate = creationDate;
    }
}
