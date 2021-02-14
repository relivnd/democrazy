package com.example.democrazy.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Answers {

    @Id
    @GeneratedValue
    private long id;

    private boolean answer;

    @OneToMany
    @JoinColumn(name = "ANSWER_ID")
    private final List<Democrates> democrates = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "ANSWER_ID")
    private final List<Question> questions = new ArrayList<>();
}
