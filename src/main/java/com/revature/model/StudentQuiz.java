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

import org.apache.tomcat.jni.Time;

@Entity
@Table(name = "student_quizes")
public class StudentQuiz {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID")
	private Student studentId;
	@ManyToOne
	@JoinColumn(name = "QUIZ_ID")
	private Quiz quizId;
	@Column(name = "STARTED_ON")
	@Temporal(TemporalType.TIME)
	private Time startedOn;
	@Column(name = "COMPLETED_ON")
	@Temporal(TemporalType.TIME)
	private Time completedOn;
	@ManyToOne
	@JoinColumn(name = "STATUS_ID")
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

	public Quiz getQuizId() {
		return quizId;
	}

	public void setQuizId(Quiz quizId) {
		this.quizId = quizId;
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