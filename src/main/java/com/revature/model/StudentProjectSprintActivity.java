package com.revature.model;

import java.util.Date;

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

@Entity
@Table(name = "student_project_sprint_activities", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "STUDENT_PROJECT_SPRINT_ID", "PROJECT_SPRINT_ACTIVITY_ID" }) })

public class StudentProjectSprintActivity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "STUDENT_PROJECT_SPRINT_ID", nullable = false)
	private StudentProjectSprint studentProjectSprintId;
	@ManyToOne
	@JoinColumn(name = "PROJECT_SPRINT_ACTIVITY_ID", nullable = false)
	private ProjectSprintActivity projectSprintActivityId;
	@Column(name = "STARTED_ON")
	@Temporal(TemporalType.DATE)
	private Date startedOn;
	@Column(name = "COMPLETED_ON")
	@Temporal(TemporalType.DATE)
	private Date completedOn;
	@ManyToOne
	@JoinColumn(name = "STATUS_ID", nullable = false)
	private SeedStatus statusId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StudentProjectSprint getStudentProjectSprintId() {
		return studentProjectSprintId;
	}

	public void setStudentProjectSprintId(StudentProjectSprint studentProjectSprintId) {
		this.studentProjectSprintId = studentProjectSprintId;
	}

	public ProjectSprintActivity getProjectSprintActivityId() {
		return projectSprintActivityId;
	}

	public void setProjectSprintActivityId(ProjectSprintActivity projectSprintActivityId) {
		this.projectSprintActivityId = projectSprintActivityId;
	}

	public Date getStartedOn() {
		return startedOn;
	}

	public void setStartedOn(Date startedOn) {
		this.startedOn = startedOn;
	}

	public Date getCompletedOn() {
		return completedOn;
	}

	public void setCompletedOn(Date completedOn) {
		this.completedOn = completedOn;
	}

	public SeedStatus getStatusId() {
		return statusId;
	}

	public void setStatusId(SeedStatus statusId) {
		this.statusId = statusId;
	}

}
