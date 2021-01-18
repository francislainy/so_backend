package com.francislainy.so.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "user_profile")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID user_id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<QuestionEntity> questions;

    public UserEntity(UUID user_id) {
        this.user_id = user_id;
    }

    public void addQuestion(QuestionEntity q) {
        if (this.questions == null) {
            this.questions = new ArrayList<>();
        }
        q.setUserEntity(this);
        this.questions.add(q);
    }

}
