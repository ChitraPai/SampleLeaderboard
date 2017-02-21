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
@Table(name = "student_projects")
public class StudentAuditDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID")
	private Student studentId;
	@Column(name = "LOGIN_ACTIVITY")
	private String loginActivity;
	@Column(name = "ACTIVITY_TIMESTAMP")
	private Timestamp activityTimestamp;
	@Column(name = "IS_SUCCESS")
	private Boolean isActive = true;
}
