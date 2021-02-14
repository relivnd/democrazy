package com.example.democrazy.service;

import com.example.democrazy.dao.QuestionRepository;
import com.example.democrazy.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository repository;

    @Autowired
    public QuestionService(QuestionRepository repository){
        this.repository = repository;
    }

    public List<Question> getAllQuestions(){
        return (List<Question>) repository.findAll();
    }
}
