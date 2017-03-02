package com.revature.biz;

import java.util.List;

import com.revature.biz.exception.BusinessServiceException;
import com.revature.model.StudentAccount;

public interface StudentAccountService {
	/**
	 * Used to do login activities.
	 * 
	 * @throws BusinessServiceException
	 *             if any business error occurs
	 */
	public List<StudentAccount> Login(String emailId, String password) throws BusinessServiceException;

	public List<StudentAccount> getActivityPoints(Integer studentId) throws BusinessServiceException;

}
