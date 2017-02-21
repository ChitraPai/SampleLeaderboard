package com.revature.model;
import java.sql.Date;

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
@Table(name = "student_course_contents",uniqueConstraints = {
	    @UniqueConstraint(columnNames={"STUDENT_COURSE_ID","COURSE_CONTENT_ID"})})
public class StudentCourseContent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne()
	@JoinColumn(name = "COURSE_ID")
	private Course courseId;
	 @Column(name = "STARTED_ON")
	  @Temporal(TemporalType.DATE)
	 private Date startedOn;
	  @Column(name ="COMPLETED_ON")
	  @Temporal(TemporalType.DATE)
	 private Date completedOn;
	  @ManyToOne
	    @JoinColumn(name = "STATUS_ID")
	  private SeedStatus statusId;
}
