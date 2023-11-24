package com.masai.quiz.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.quiz.Model.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer>{
	  Quiz findByTitle(String title);
}
