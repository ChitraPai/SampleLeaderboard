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

	List<StudentCourse> getAllStudentCourseSkillPointsById(Integer id) throws BusinessServiceException;

	List<StudentCourse> getAllStudentCourseActivityPoints() throws BusinessServiceException;

	List<StudentCourse> getAllStudentCourseActivityPointsById(Integer studentId) throws BusinessServiceException;

	List<StudentCourse> getAllStudentCourseHoursSpent(Integer studentId) throws BusinessServiceException;

	List<StudentCourse> getAllStudentCoursePercentage(Integer studentId) throws BusinessServiceException;

	List<StudentCourse> getAllStudentCourseDetails(String courseName) throws BusinessServiceException;

	List<StudentCourse> getAllStudentCourseActivityDetails(String courseName) throws BusinessServiceException;

}
