package com.revature.biz.impl;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.biz.StudentCourseService;
import com.revature.biz.exception.BusinessServiceException;
import com.revature.data.StudentCourseDAO;
import com.revature.data.exception.DataServiceException;
import com.revature.model.StudentCourse;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {
	private static Logger logger = Logger.getLogger(CategoryServiceImpl.class);

	@Autowired
	private StudentCourseDAO studentcourseDAO;

	@Override
	public List<StudentCourse> getAllStudentCourses() throws BusinessServiceException {
		List<StudentCourse> studentCourses = null;
		try {
			studentCourses = studentcourseDAO.getAllStudentCourses();
			logger.info("student courses retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentCourses;
	}

	@Override
	public List<StudentCourse> getAllStudentCourseSkillPoints() throws BusinessServiceException {
		List<StudentCourse> studentCourses = null;
		try {
			studentCourses = studentcourseDAO.getAllStudentCourseSkillPoints();
			logger.info("student courses retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentCourses;

	}

	@Override
	public List<StudentCourse> getAllStudentCourseActivityPoints() throws BusinessServiceException {
		List<StudentCourse> studentCourses = null;
		try {
			studentCourses = studentcourseDAO.getAllStudentCourseActivityPoints();
			logger.info("student courses retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentCourses;

	}

	@Override
	public List<StudentCourse> getAllStudentCourseHoursSpent() throws BusinessServiceException {
		List<StudentCourse> studentCourses = null;
		try {
			studentCourses = studentcourseDAO.getAllStudentCourseHoursSpent();
			logger.info("student courses retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentCourses;

	}

	@Override
	public List<StudentCourse> getAllStudentCoursePercentage() throws BusinessServiceException {
		List<StudentCourse> studentCourses = null;
		try {
			studentCourses = studentcourseDAO.getAllStudentCoursePercentage();
			logger.info("student courses retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentCourses;
	}

	@Override
	public List<StudentCourse> getCourseSkillPointsByStudentId(Integer studentId) throws BusinessServiceException {
		List<StudentCourse> studentCourses = null;
		try {
			studentCourses = studentcourseDAO.getCourseSkillPointsByStudentId(studentId);
			logger.info("student courses retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentCourses;

	}

}
