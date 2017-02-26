package com.revature.data;

import java.util.List;

import com.revature.data.exception.DataServiceException;
import com.revature.model.StudentCourse;

public interface StudentCourseDAO {
	/**
	 * Used to get the student courses data from db.
	 * 
	 * @return student courses
	 * @throws DataServiceException
	 *             if any exception happens while executing the query
	 */

	public List<StudentCourse> getAllStudentCourses() throws DataServiceException;

	public List<StudentCourse> getAllStudentCourseSkillPoints() throws DataServiceException;
	
	public List<StudentCourse> getCourseSkillPointsByStudentId(Integer studentId) throws DataServiceException;


	public List<StudentCourse> getAllStudentCourseActivityPoints() throws DataServiceException;

	public List<StudentCourse> getAllStudentCourseHoursSpent() throws DataServiceException;

	public List<StudentCourse> getAllStudentCoursePercentage() throws DataServiceException;

}
