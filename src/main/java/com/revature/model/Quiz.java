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
@Table(name = "categories")
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	private Category categoryId;
	@ManyToOne
	@JoinColumn(name = "LEVEL_ID", nullable = false)
	private Level levelId;
	@Column(unique = true, nullable = false)
	private String name;
	@Column(name = "DURATION_IN_MINUTES", nullable = false)
	private Integer duration;
	@Column(name = "NUM_OF_QUESTIONS", nullable = false)
	private Integer numOfQuestions;
	@Column(name = "MAX_ATTEMPTS", nullable = false)
	private Integer maxAttempts = 1;
	@Column(name = "IS_ANSWER_DISPLAY", nullable = false)
	private Boolean isAnswerDisplay = false;
	@Column(name = "IS_ACTIVE", nullable = false)
	private Boolean isActive = true;

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

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getNumOfQuestions() {
		return numOfQuestions;
	}

	public void setNumOfQuestions(Integer numOfQuestions) {
		this.numOfQuestions = numOfQuestions;
	}

	public Integer getMaxAttempts() {
		return maxAttempts;
	}

	public void setMaxAttempts(Integer maxAttempts) {
		this.maxAttempts = maxAttempts;
	}

	public Boolean getIsAnswerDisplay() {
		return isAnswerDisplay;
	}

	public void setIsAnswerDisplay(Boolean isAnswerDisplay) {
		this.isAnswerDisplay = isAnswerDisplay;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}
