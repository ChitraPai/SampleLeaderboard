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
	  public List<StudentCourse> getAllStudentCourseSkillPointsById(Integer studentId) throws DataServiceException {
		    List<StudentCourse> studentCourses = null;
		    try {
		      StringBuilder sb = new StringBuilder("SELECT NAME,skill_points FROM vw_student_course_skill_points WHERE STUDENT_ID="+studentId);
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
	  public List<StudentCourse> getStudentCourseActivityPointsById(Integer studentId) throws DataServiceException {
		    List<StudentCourse> studentCourses = null;
		    try {
		      StringBuilder sb = new StringBuilder("SELECT enrollment_points,completion_points FROM vw_student_course_activity_points WHERE ID="+studentId);
		      studentCourses = dataRetriver.retrieveBySQL(sb.toString());
		      logger.info("Student courses data retrieval success..");
		    } catch (DataAccessException e) {
		      logger.error(e.getMessage(), e);
		      throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		    }
		    return studentCourses;
		  }
	  
	  @Override
	  public List<StudentCourse> getStudentCourseHoursSpent(Integer studentId) throws DataServiceException {
		    List<StudentCourse> studentCourses = null;
		    try {
		      StringBuilder sb = new StringBuilder("SELECT NAME,HOURS_SPENT FROM vw_student_course_hours_spent WHERE STUDENT_ID="+studentId);
		      studentCourses = dataRetriver.retrieveBySQL(sb.toString());
		      logger.info("Student courses data retrieval success..");
		    } catch (DataAccessException e) {
		      logger.error(e.getMessage(), e);
		      throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		    }
		    return studentCourses;
		  }
	  @Override
	  public List<StudentCourse> getStudentCoursePercentage(Integer studentId) throws DataServiceException {
		    List<StudentCourse> studentCourses = null;
		    try {
		      StringBuilder sb = new StringBuilder("SELECT NAME,percentage FROM vw_student_course_percentage_calculation WHERE student="+studentId);
		      studentCourses = dataRetriver.retrieveBySQL(sb.toString());
		      logger.info("Student courses data retrieval success..");
		    } catch (DataAccessException e) {
		      logger.error(e.getMessage(), e);
		      throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		    }
		    return studentCourses;
		  }
	  @Override
	  public List<StudentCourse> getStudentCourseDetails(String courseName) throws DataServiceException {
		    List<StudentCourse> studentCourses = null;
		    try {
		      StringBuilder sb = new StringBuilder("SELECT * FROM VW_STUDENT_COURSE_DETAILS WHERE COURSE_NAME = '" + courseName+"'");
		      studentCourses = dataRetriver.retrieveBySQLJSON(sb.toString());
		      logger.info("Student courses data retrieval success..");
		    } catch (DataAccessException e) {
		      logger.error(e.getMessage(), e);
		      throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		    }
		    return studentCourses;
		  }
	  @Override
	  public List<StudentCourse> getStudentCourseActivityDetails(String courseName) throws DataServiceException {
		    List<StudentCourse> studentCourses = null;
		    try {
		      StringBuilder sb = new StringBuilder("SELECT ACTIVITY_NAME FROM VW_STUDENT_COURSE_ACTIVITY_DETAILS WHERE COURSE_NAME = '" + courseName+"'");
		      studentCourses = dataRetriver.retrieveBySQLJSON(sb.toString());
		      logger.info("Student courses data retrieval success..");
		    } catch (DataAccessException e) {
		      logger.error(e.getMessage(), e);
		      throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		    }
		    return studentCourses;
		  }
	  
	  


	
//		List<QueryParameter<?>> queryParameters=new ArrayList<>();
//		queryParameters.add(new QueryParameter<>("id",studentId));
			
	
}
