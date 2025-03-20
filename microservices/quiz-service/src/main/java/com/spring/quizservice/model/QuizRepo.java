package com.spring.quizservice.model;

import lombok.Data;

@Data
public class QuizRepo {
    String categoryName;
    Integer numQuestions;
    String title;
}
