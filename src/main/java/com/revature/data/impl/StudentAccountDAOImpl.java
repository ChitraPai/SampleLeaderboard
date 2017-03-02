package com.revature.data.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.data.StudentAccountDAO;
import com.revature.data.access.DataRetriver;
import com.revature.data.access.exception.DataAccessException;
import com.revature.data.exception.DataServiceException;
import com.revature.data.utils.DataUtils;
import com.revature.model.StudentAccount;

@Repository
public class StudentAccountDAOImpl implements StudentAccountDAO {
	private static Logger logger = Logger.getLogger(StudentAccountDAOImpl.class);
	@Autowired
	private DataRetriver dataRetriver;

	public DataRetriver getDataRetriver() {
		return dataRetriver;
	}

	public void setDataRetriver(DataRetriver dataRetriver) {
		this.dataRetriver = dataRetriver;
	}

	@Override
	public List<StudentAccount> getId(String emailId, String password) throws DataServiceException {

		List<StudentAccount> studentAccount = null;
		try {
			StringBuilder sb = new StringBuilder("SELECT STUDENT_ID FROM student_account WHERE USERNAME='" + emailId
					+ "'" + " and PASSWORD='" + password + "'");
			studentAccount = dataRetriver.retrieveBySQL(sb.toString());
			logger.info("Student courses data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return studentAccount;

	}

	@Override
	public List<StudentAccount> getActivityPointsByStudentId(Integer studentId) throws DataServiceException {
		List<StudentAccount> studentAccount = null;
		try {
			StringBuilder sb = new StringBuilder(
					"select course_enrollment_points,course_completion_points,project_enrollment_points,project_completion_points,login_points from vw_student_activity_points where student_id="
							+ studentId);
			studentAccount = dataRetriver.retrieveBySQLJSON(sb.toString());
			logger.info("Student activity points data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return studentAccount;

	}

	@Override
	public List<StudentAccount> getTotalActivityPointsByStudentId(Integer studentId) throws DataServiceException {
		List<StudentAccount> studentAccount = null;
		try {
			StringBuilder sb = new StringBuilder(
					"select total_activity_points from vw_final_student_activity_points where student_id="
							+ studentId);
			studentAccount = dataRetriver.retrieveBySQLJSON(sb.toString());
			logger.info("Student activity points data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return studentAccount;
	}

	@Override
	public List<StudentAccount> getTotalSkillPointsByStudentId(Integer studentId) throws DataServiceException {
		List<StudentAccount> studentAccount = null;
		try {
			StringBuilder sb = new StringBuilder(
					"select total_skill_points from vw_final_student_skill_points where student_id="
							+ studentId);
			studentAccount = dataRetriver.retrieveBySQLJSON(sb.toString());
			logger.info("Student activity points data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return studentAccount;
	}

	
	
	
}
