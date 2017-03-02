package com.revature.data;

import java.util.List;

import com.revature.data.exception.DataServiceException;
import com.revature.model.StudentAccount;

public interface StudentAccountDAO {
	/**
	 * Used to get the login data from db.
	 * 
	 * @return login
	 * @throws DataServiceException
	 *             if any exception happens while executing the query
	 */

	public List<StudentAccount> getId(String emailId, String password) throws DataServiceException;

	public List<StudentAccount> getActivityPointsByStudentId(Integer studentId) throws DataServiceException;

	public List<StudentAccount> getTotalActivityPointsByStudentId(Integer studentId) throws DataServiceException;

	public List<StudentAccount> getTotalSkillPointsByStudentId(Integer studentId) throws DataServiceException;

}
