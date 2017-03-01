package com.revature.biz.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.biz.StudentProjectService;
import com.revature.biz.exception.BusinessServiceException;
import com.revature.data.StudentProjectDAO;
import com.revature.data.exception.DataServiceException;
import com.revature.model.StudentProject;

@Service
public class StudentProjectServiceImpl implements StudentProjectService {
	private static Logger logger = Logger.getLogger(StudentProjectServiceImpl.class);

	@Autowired
	private StudentProjectDAO studentProjectDAO;

	@Override
	public List<StudentProject> getAllStudentProjects() throws BusinessServiceException {
		List<StudentProject> studentProjects = null;
		try {
			studentProjects = studentProjectDAO.getAllStudentProjects();
			logger.info("Student Projects retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentProjects;
	}

	@Override
	public List<StudentProject> getAllStudentProjectSkillPoints() throws BusinessServiceException {
		List<StudentProject> studentProjects = null;
		try {
			studentProjects = studentProjectDAO.getAllStudentProjectSkillPoints();
			logger.info("Student Project Skill Points retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentProjects;
	}

	@Override
	public List<StudentProject> getAllStudentProjectActivityPoints() throws BusinessServiceException {
		List<StudentProject> studentProjects = null;
		try {
			studentProjects = studentProjectDAO.getAllStudentProjectActivityPoints();
			logger.info("Student Project Activity Points retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentProjects;
	}

	@Override
	public List<StudentProject> getStudentProjectSkillPoints(Integer studentId) throws BusinessServiceException {
		List<StudentProject> studentProjects = null;
		try {
			studentProjects = studentProjectDAO.getStudentProjectSkillPointsById(studentId);
			logger.info("Student Project Skill Points retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentProjects;
	}

	@Override
	public List<StudentProject> getStudentProjectActivityPoints(Integer studentId) throws BusinessServiceException {
		List<StudentProject> studentProjects = null;
		try {
			studentProjects = studentProjectDAO.getStudentProjectActivityPointsById(studentId);
			logger.info("Student Project Activity Points retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentProjects;
	}
}
