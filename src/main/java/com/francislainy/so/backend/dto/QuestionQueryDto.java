package com.francislainy.so.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class QuestionQueryDto {

    private UUID id;
    private String title;
    private Long creationDate;
    private Long lastUpdated;


    public QuestionQueryDto(UUID id, String title, Long creationDate) {
        this.id = id;
        this.title = title;
        this.creationDate = creationDate;
    }
}
