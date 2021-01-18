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
    private Integer totalDownVotes;
    private Integer totalUpVotes;
    private Integer totalVotes;

    public QuestionQueryDto(UUID id, String title, Long creationDate) {
        this.id = id;
        this.title = title;
        this.creationDate = creationDate;
    }

    public QuestionQueryDto(UUID id, String title, Integer totalDownVotes, Integer totalUpVotes, Integer totalVotes) {
        this.id = id;
        this.title = title;
        this.totalDownVotes = totalDownVotes;
        this.totalUpVotes = totalUpVotes;
        this.totalVotes = totalVotes;
    }

    public QuestionQueryDto(UUID id, String title, Long creationDate, Long lastUpdated) {

        this.id = id;
        this.title = title;
        this.creationDate = creationDate;
        this.lastUpdated = lastUpdated;
    }

}
