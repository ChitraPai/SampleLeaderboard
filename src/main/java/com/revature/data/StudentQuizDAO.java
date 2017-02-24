package com.revature.data;

import java.util.List;

import com.revature.data.exception.DataServiceException;
import com.revature.model.StudentQuiz;

public interface StudentQuizDAO {

	/**
	 * Used to get the student quiz data from db.
	 * 
	 * @return studentQuizzes
	 * @throws DataServiceException
	 *             if any exception happens while executing the query
	 */

	public List<StudentQuiz> getAllStudentQuiz() throws DataServiceException;

	public List<StudentQuiz> getAllStudentQuizSkillPoints() throws DataServiceException;
}
