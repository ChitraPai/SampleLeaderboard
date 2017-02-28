package com.revature.biz;

import java.util.List;

import com.revature.biz.exception.BusinessServiceException;
import com.revature.model.StudentQuiz;

public interface StudentQuizService {
	/**
	 * Used to get all the student quizzes.
	 * 
	 * @return studentQuizzes
	 * @throws BusinessServiceException
	 *             if any business error occurs
	 */
	List<StudentQuiz> getAllStudentQuiz() throws BusinessServiceException;

	List<StudentQuiz> getAllStudentQuizSkillPoints() throws BusinessServiceException;
	
	List<StudentQuiz> getStudentQuizSkillPointsById(Integer studentId) throws BusinessServiceException;


}
