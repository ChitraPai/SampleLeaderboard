package com.revature.data.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.data.StudentCourseDAO;
import com.revature.data.access.DataRetriver;
import com.revature.data.access.exception.DataAccessException;
import com.revature.data.exception.DataServiceException;
import com.revature.data.utils.DataUtils;
import com.revature.model.StudentCourse;

@Repository
public class StudentCourseDAOImpl implements StudentCourseDAO {
	private static Logger logger = Logger.getLogger(CategoryDAOImpl.class);
	@Autowired
	private DataRetriver dataRetriver;

	public DataRetriver getDataRetriver() {
		return dataRetriver;
	}

	public void setDataRetriver(DataRetriver dataRetriver) {
		this.dataRetriver = dataRetriver;
	}

	@Override
	public List<StudentCourse> getAllStudentCourses() throws DataServiceException {
		List<StudentCourse> studentCourses = null;
		try {
			StringBuilder sb = new StringBuilder("select * FROM student_courses sc");
			studentCourses = dataRetriver.retrieveBySQL(sb.toString());
			logger.info("Student courses data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return studentCourses;
	}

	@Override
	public List<StudentCourse> getAllStudentCourseSkillPoints() throws DataServiceException {
		List<StudentCourse> studentCourses = null;
		try {
			StringBuilder sb = new StringBuilder("SELECT * FROM vw_student_course_skill_points");
			studentCourses = dataRetriver.retrieveBySQL(sb.toString());
			logger.info("Student courses data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return studentCourses;
	}

	@Override
	public List<StudentCourse> getAllStudentCourseActivityPoints() throws DataServiceException {
		List<StudentCourse> studentCourses = null;
		try {
			StringBuilder sb = new StringBuilder("SELECT * FROM vw_student_course_activity_points");
			studentCourses = dataRetriver.retrieveBySQL(sb.toString());
			logger.info("Student courses data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return studentCourses;
	}

	@Override
	public List<StudentCourse> getAllStudentCourseHoursSpent() throws DataServiceException {
		List<StudentCourse> studentCourses = null;
		try {
			StringBuilder sb = new StringBuilder("SELECT * FROM vw_student_course_hours_spent");
			studentCourses = dataRetriver.retrieveBySQL(sb.toString());
			logger.info("Student courses data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return studentCourses;
	}

	@Override
	public List<StudentCourse> getAllStudentCoursePercentage() throws DataServiceException {
		List<StudentCourse> studentCourses = null;
		try {
			StringBuilder sb = new StringBuilder("SELECT * FROM vw_student_course_percentage_calculation");
			studentCourses = dataRetriver.retrieveBySQL(sb.toString());
			logger.info("Student courses data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return studentCourses;
	}

	@Override
	public List<StudentCourse> getCourseSkillPointsByStudentId(Integer studentId) throws DataServiceException {
		List<StudentCourse> studentCourses = null;
		try {
//		List<QueryParameter<?>> queryParameters=new ArrayList<>();
//		queryParameters.add(new QueryParameter<>("id",studentId));
			StringBuilder sb = new StringBuilder("SELECT NAME,skill_points FROM vw_student_course_skill_points where STUDENT_ID="+studentId);
			studentCourses = dataRetriver.retrieveBySQL(sb.toString());
			logger.info("Student courses data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return studentCourses;

	}

}
