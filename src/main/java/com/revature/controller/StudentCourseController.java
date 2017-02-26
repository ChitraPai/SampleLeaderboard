package com.revature.controller;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.revature.biz.StudentCourseService;
import com.revature.biz.exception.BusinessServiceException;
import com.revature.controller.exception.InternalException;
import com.revature.controller.exception.InvalidInputException;
import com.revature.model.StudentCourse;

@RestController
//@RequestMapping("/")

public class StudentCourseController {
	private static Logger logger = Logger.getLogger(CategoryController.class);

	  @Autowired
	  private StudentCourseService studentCourseService;

	  @RequestMapping("/courses")
	  public List<StudentCourse> getActiveStudentCourseController() {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCourses();
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
	  @RequestMapping("/courseskillpoints")
	  public List<StudentCourse> getActiveStudentCourseSkillPointsController() {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCourseSkillPoints();
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
	  @RequestMapping("/courseactivitypoints")
	  public List<StudentCourse> getActiveStudentCourseAtivityPointsController() {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCourseActivityPoints();
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
	  @RequestMapping("/coursehoursspent")
	  public List<StudentCourse> getActiveStudentCourseHoursSpentController() {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCourseHoursSpent();
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
	  @RequestMapping("/coursepercentage")
	  public List<StudentCourse> getActiveStudentPercentageController() {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCoursePercentage();
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
	  @RequestMapping("/courseskillpointsbyid/{studentId}")
	  public List<StudentCourse> getActiveStudentCourseSkillPointsByIdController(@PathVariable("studentId") Integer studentId) {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getCourseSkillPointsByStudentId(studentId);
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }

}
