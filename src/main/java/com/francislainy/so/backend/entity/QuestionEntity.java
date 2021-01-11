package com.francislainy.so.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "question")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "creation_date", nullable = false)
    private Long creationDate;

    @Column(name = "last_updated", nullable = true)
    private Long lastUpdated;

    @Column(name="total_votes", nullable = true)
    private Integer totalVotes;

    @Column(name="total_upvotes", nullable = true)
    private Integer totalUpVotes;

    @Column(name="total_downvotes", nullable = true)
    private Integer totalDownVotes;

}
