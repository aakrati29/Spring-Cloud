package com.spring.quizapp.repositories;

import com.spring.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz,Integer> {
}
