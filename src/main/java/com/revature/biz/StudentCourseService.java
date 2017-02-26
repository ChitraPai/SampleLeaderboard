package com.revature.biz;

import java.util.List;

import com.revature.biz.exception.BusinessServiceException;
import com.revature.model.StudentCourse;

public interface StudentCourseService {
	/**
	 * Used to get all the student courses.
	 * 
	 * @return student courses
	 * @throws BusinessServiceException
	 *             if any business error occurs
	 */
	List<StudentCourse> getAllStudentCourses() throws BusinessServiceException;

	List<StudentCourse> getAllStudentCourseSkillPoints() throws BusinessServiceException;
	
	List<StudentCourse> getCourseSkillPointsByStudentId(Integer studentId) throws BusinessServiceException;


	List<StudentCourse> getAllStudentCourseActivityPoints() throws BusinessServiceException;

	List<StudentCourse> getAllStudentCourseHoursSpent() throws BusinessServiceException;

	List<StudentCourse> getAllStudentCoursePercentage() throws BusinessServiceException;

}
