package com.example.democrazy.rest;

import com.example.democrazy.model.Question;
import com.example.democrazy.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class QuestionsRestController {

    private final QuestionService questionService;

    @Autowired
    public QuestionsRestController(QuestionService questionService){
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getAll(){
        return questionService.getAllQuestions();
    }
}
