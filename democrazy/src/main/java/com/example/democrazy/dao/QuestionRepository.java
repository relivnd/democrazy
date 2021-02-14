package com.example.democrazy.dao;

import com.example.democrazy.model.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
}
