package com.revature.model;

import java.util.List;

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
	public StudentProject() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID", nullable = false)
	private Student student;
	@ManyToOne
	@JoinColumn(name = "PROJECT_ID", nullable = false)
	private List<Project> project;
	@Column(name = "STARTED_ON")
	@Temporal(TemporalType.TIME)
	private Time startedOn;
	@Column(name = "COMPLETED_ON")
	@Temporal(TemporalType.TIME)
	private Time completedOn;
	@ManyToOne
	@JoinColumn(name = "STATUS_ID")
	private SeedStatus status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
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

	public SeedStatus getStatus() {
		return status;
	}

	public void setStatus(SeedStatus status) {
		this.status = status;
	}

}
