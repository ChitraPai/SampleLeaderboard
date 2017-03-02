package com.revature.biz;

import java.util.List;

import com.revature.biz.exception.BusinessServiceException;
import com.revature.model.StudentProject;

public interface StudentProjectService {
	/**
	 * Used to get all the student projects.
	 * 
	 * @return studentProjects
	 * @throws BusinessServiceException
	 *             if any business error occurs
	 */
	List<StudentProject> getAllStudentProjects() throws BusinessServiceException;

	List<StudentProject> getAllStudentProjectSkillPoints() throws BusinessServiceException;

	List<StudentProject> getAllStudentProjectActivityPoints() throws BusinessServiceException;
	List<StudentProject> getStudentProjectSkillPointsByStudentId(Integer studentId) throws BusinessServiceException;
	List<StudentProject> getStudentProjectActivityPointsByStudentId(Integer studentId) throws BusinessServiceException;



}
