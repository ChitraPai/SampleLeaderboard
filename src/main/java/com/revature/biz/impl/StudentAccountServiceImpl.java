package com.revature.biz.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.biz.StudentAccountService;
import com.revature.biz.StudentCourseService;
import com.revature.biz.StudentProjectService;
import com.revature.biz.StudentQuizService;
import com.revature.biz.exception.BusinessServiceException;
import com.revature.data.StudentCourseDAO;
import com.revature.model.StudentAccount;

@Service
public class StudentAccountServiceImpl implements StudentAccountService {
	private static Logger logger = Logger.getLogger(CategoryServiceImpl.class);

	@Autowired
	private StudentCourseService studentCourseService;
	private StudentProjectService studentProjectService;
	private StudentQuizService studentQuizService;
	@Override
	public List<StudentAccount> getAllStudentPoints() throws BusinessServiceException {
		studentCourseService.getAllStudentCourseActivityPoints();
		return null;
	}
	
	

}
