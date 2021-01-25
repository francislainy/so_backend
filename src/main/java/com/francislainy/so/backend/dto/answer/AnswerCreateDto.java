package com.francislainy.so.backend.dto.answer;

import com.francislainy.so.backend.entity.question.QuestionEntity;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AnswerCreateDto {

    private UUID id;
    private Long creationDate;
    private String content;
    private UUID userId;

    @SerializedName("question")
    private QuestionEntity questionEntity;

    public AnswerCreateDto(UUID id, Long creationDate, String content, QuestionEntity questionEntity) {
        this.id = id;
        this.creationDate = creationDate;
        this.content = content;
        this.questionEntity = questionEntity;
    }

}
