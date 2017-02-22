package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "project_sprint_activities", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "PROJECT_SPRINT_ID", "VIDEO_ID" }),
		@UniqueConstraint(columnNames = { "PROJECT_SPRINT_ID", "COURSE_ID" }),
		@UniqueConstraint(columnNames = { "PROJECT_SPRINT_ID", "QUIZ_ID" }),
		@UniqueConstraint(columnNames = { "PROJECT_SPRINT_ID", "ONLINE_ACTIVITY" }),
		@UniqueConstraint(columnNames = { "PROJECT_SPRINT_ID", "OFFLINE_ACTIVITY" }) })
public class ProjectSprintActivity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne()
	@JoinColumn(name = "PROJECT_SPRINT_ID", nullable = false)
	private ProjectSprint projectSprintId;
	@ManyToOne()
	@JoinColumn(name = "VIDEO_ID")
	private Video videoId;
	@ManyToOne()
	@JoinColumn(name = "COURSE_ID")
	private Course courseId;
	@ManyToOne()
	@JoinColumn(name = "QUIZ_ID")
	private Quiz quizId;
	@Column(name = "ONLINE_ACTIVITY")
	private String onlineActivity;
	@Column(name = "OFFLINE_ACTIVITY")
	private String offlineActivity;
	@Column(nullable = false)
	private String name;
	@Column(name = "DURATION_IN_MINUTES")
	private Integer durationInMinutes;
	@Column(name = "SKILL_POINTS", nullable = false)
	private Integer skillPoints;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProjectSprint getProjectSprintId() {
		return projectSprintId;
	}

	public void setProjectSprintId(ProjectSprint projectSprintId) {
		this.projectSprintId = projectSprintId;
	}

	public Video getVideoId() {
		return videoId;
	}

	public void setVideoId(Video videoId) {
		this.videoId = videoId;
	}

	public Course getCourseId() {
		return courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

	public Quiz getQuizId() {
		return quizId;
	}

	public void setQuizId(Quiz quizId) {
		this.quizId = quizId;
	}

	public String getOnlineActivity() {
		return onlineActivity;
	}

	public void setOnlineActivity(String onlineActivity) {
		this.onlineActivity = onlineActivity;
	}

	public String getOfflineActivity() {
		return offlineActivity;
	}

	public void setOfflineActivity(String offlineActivity) {
		this.offlineActivity = offlineActivity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(Integer durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public Integer getSkillPoints() {
		return skillPoints;
	}

	public void setSkillPoints(Integer skillPoints) {
		this.skillPoints = skillPoints;
	}

}
