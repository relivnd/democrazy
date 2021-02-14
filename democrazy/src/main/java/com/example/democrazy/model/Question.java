package com.example.democrazy.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Question {

    @Id
    @GeneratedValue
    private long id;

    private String questionString;

    private String answerTrue;

    private String answerFalse;
}
