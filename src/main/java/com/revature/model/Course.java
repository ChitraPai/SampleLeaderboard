package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne()
	@JoinColumn(name = "CATEGORY_ID")
	private Category categoryId;
	@ManyToOne()
	@JoinColumn(name = "LEVEL_ID")
	private Level levelId;
	@Column(unique = true)
	private String name;
	private String description;
	@Column(name = "ENROLLMENT_POINTS")
	private Integer enrollmentPoints;
	@Column(name = "COMPLETION_POINTS")
	private Integer completionPoints;
	@Column(name = "IS_ACTIVE")
	private Boolean isActive=true;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Category getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}
	public Level getLevelId() {
		return levelId;
	}
	public void setLevelId(Level levelId) {
		this.levelId = levelId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getEnrollmentPoints() {
		return enrollmentPoints;
	}
	public void setEnrollmentPoints(Integer enrollmentPoints) {
		this.enrollmentPoints = enrollmentPoints;
	}
	public Integer getCompletionPoints() {
		return completionPoints;
	}
	public void setCompletionPoints(Integer completionPoints) {
		this.completionPoints = completionPoints;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
