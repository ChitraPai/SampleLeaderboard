package com.revature.biz;

import java.util.List;

import com.revature.biz.exception.BusinessServiceException;
import com.revature.model.StudentAccount;

public interface StudentAccountService {
	/**
	 * Used to get all the student accounts.
	 * 
	 * @return student accounts
	 * @throws BusinessServiceException
	 *             if any business error occurs
	 */
	List<StudentAccount> getAllStudentPoints() throws BusinessServiceException;
}
