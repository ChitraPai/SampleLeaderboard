package com.revature.biz.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.biz.StudentAccountService;
import com.revature.biz.exception.BusinessServiceException;
import com.revature.data.StudentAccountDAO;
import com.revature.data.exception.DataServiceException;
import com.revature.model.StudentAccount;

@Service
public class StudentAccountServiceImpl implements StudentAccountService {
	private static Logger logger = Logger.getLogger(StudentAccountServiceImpl.class);

	@Autowired
	private StudentAccountDAO studentaccountDAO;

	@Override
	public List<StudentAccount> Login(String emailId, String password) throws BusinessServiceException {
		List<StudentAccount> studentAccount = null;
		try {
			studentAccount = studentaccountDAO.getId(emailId, password);
			logger.info("login data retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentAccount;

	}

	@Override
	public List<StudentAccount> getActivityPointsByStudentId(Integer studentId) throws BusinessServiceException {
		List<StudentAccount> studentAccount = null;
		try {
			studentAccount = studentaccountDAO.getActivityPointsByStudentId(studentId);
			logger.info("student activity points data retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentAccount;

	}

	@Override
	public List<StudentAccount> getTotalActivityPointsByStudentId(Integer studentId) throws BusinessServiceException {
		List<StudentAccount> studentAccount = null;
		try {
			studentAccount = studentaccountDAO.getTotalActivityPointsByStudentId(studentId);
			logger.info("student activity points data retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentAccount;

	}

	@Override
	public List<StudentAccount> getTotalSkillPointsByStudentId(Integer studentId) throws BusinessServiceException {
		List<StudentAccount> studentAccount = null;
		try {
			studentAccount = studentaccountDAO.getTotalSkillPointsByStudentId(studentId);
			logger.info("student activity points data retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentAccount;

	}

}
