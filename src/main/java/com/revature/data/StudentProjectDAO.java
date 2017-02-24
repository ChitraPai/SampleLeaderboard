package com.revature.data;

import java.util.List;

import com.revature.data.exception.DataServiceException;
import com.revature.model.StudentProject;

public interface StudentProjectDAO {
	/**
	 * Used to get the student projects data from db.
	 * 
	 * @return studentProjects
	 * @throws DataServiceException
	 *             if any exception happens while executing the query
	 */

	public List<StudentProject> getAllStudentProjects() throws DataServiceException;

	public List<StudentProject> getAllStudentProjectSkillPoints() throws DataServiceException;

	public List<StudentProject> getAllStudentProjectActivityPoints() throws DataServiceException;

}
