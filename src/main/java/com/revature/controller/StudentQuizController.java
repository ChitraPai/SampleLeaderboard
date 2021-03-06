package com.revature.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.biz.StudentQuizService;
import com.revature.biz.exception.BusinessServiceException;
import com.revature.controller.exception.InternalException;
import com.revature.controller.exception.InvalidInputException;
import com.revature.model.StudentQuiz;

@RestController
@RequestMapping("/quiz")
public class StudentQuizController {
	private static Logger logger = Logger.getLogger(CategoryController.class);

	@Autowired
	private StudentQuizService studentQuizService;

	@RequestMapping("/skillpoints")
	public List<StudentQuiz> getActiveStudentQuizController() {
		List<StudentQuiz> studentQuizzes = null;
		try {
			logger.info("Getting the student quizzes data...");
			studentQuizzes = studentQuizService.getAllStudentQuizSkillPoints();
			logger.info("student quizzes data retrieval success.");
		} catch (BusinessServiceException e) {
			logger.error(e.getMessage(), e);
			throw new InvalidInputException(e.getMessage(), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new InternalException("System has some issue...", e);
		}
		return studentQuizzes;
	}
	
	@RequestMapping("/skill/points/{studentId}")
	public List<StudentQuiz> getActiveStudentQuizByIdController(@PathVariable("studentId") Integer studentId) {
		List<StudentQuiz> studentQuizzes = null;
		try {
			logger.info("Getting the student quizzes data...");
			studentQuizzes = studentQuizService.getStudentQuizSkillPointsById(studentId);
			logger.info("student quizzes data retrieval success.");
		} catch (BusinessServiceException e) {
			logger.error(e.getMessage(), e);
			throw new InvalidInputException(e.getMessage(), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new InternalException("System has some issue...", e);
		}
		return studentQuizzes;
	}
}
