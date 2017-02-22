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
@Table(name = "student_course_contents", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "STUDENT_COURSE_ID", "COURSE_CONTENT_ID" }) })
public class StudentCourseContent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne()
	@JoinColumn(name = "STUDENT_COURSE_ID", nullable = false)
	private StudentCourse sudentCourseId;
	@ManyToOne()
	@JoinColumn(name = "COURSE_CONTENT_ID", nullable = false)
	private CourseContent courseContentId;
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

	public StudentCourse getSudentCourseId() {
		return sudentCourseId;
	}

	public void setSudentCourseId(StudentCourse sudentCourseId) {
		this.sudentCourseId = sudentCourseId;
	}

	public CourseContent getCourseContentId() {
		return courseContentId;
	}

	public void setCourseContentId(CourseContent courseContentId) {
		this.courseContentId = courseContentId;
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
