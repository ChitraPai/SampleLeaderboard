package com.revature.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_audit_details")
public class StudentAuditDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID", nullable = false)
	private Student studentId;
	@Column(name = "LOGIN_ACTIVITY", nullable = false)
	private String loginActivity;
	@Column(name = "ACTIVITY_TIMESTAMP", nullable = false)
	private Timestamp activityTimestamp;
	@Column(name = "IS_SUCCESS", nullable = false)
	private Boolean isSuccess = true;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	public String getLoginActivity() {
		return loginActivity;
	}

	public void setLoginActivity(String loginActivity) {
		this.loginActivity = loginActivity;
	}

	public Timestamp getActivityTimestamp() {
		return activityTimestamp;
	}

	public void setActivityTimestamp(Timestamp activityTimestamp) {
		this.activityTimestamp = activityTimestamp;
	}

	public Boolean getIsActive() {
		return isSuccess;
	}

	public void setIsActive(Boolean isActive) {
		this.isSuccess = isActive;
	}
}
