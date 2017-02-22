package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.apache.tomcat.jni.Time;

@Entity
@Table(name = "student_projects", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "STUDENT_ID", "PROJECT_ID" }) })

public class StudentProject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID", nullable = false)
	private Student studentId;
	@ManyToOne
	@JoinColumn(name = "PROJECT_ID", nullable = false)
	private Project projectId;
	@Column(name = "STARTED_ON")
	@Temporal(TemporalType.TIME)
	private Time startedOn;
	@Column(name = "COMPLETED_ON")
	@Temporal(TemporalType.TIME)
	private Time completedOn;
	@ManyToOne
	@JoinColumn(name = "STATUS_ID", nullable = false)
	private SeedStatus statusId;

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

	public Project getProjectId() {
		return projectId;
	}

	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}

	public Time getStartedOn() {
		return startedOn;
	}

	public void setStartedOn(Time startedOn) {
		this.startedOn = startedOn;
	}

	public Time getCompletedOn() {
		return completedOn;
	}

	public void setCompletedOn(Time completedOn) {
		this.completedOn = completedOn;
	}

	public SeedStatus getStatusId() {
		return statusId;
	}

	public void setStatusId(SeedStatus statusId) {
		this.statusId = statusId;
	}
}
