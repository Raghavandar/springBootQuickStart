package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{courseId}")
	public Course getCourseDetail(@PathVariable String courseId) {
		return courseService.getCourseDetail(courseId);
	}
	
	@PostMapping("/topics/{topicId}/courses")
	public String addCourse(@RequestBody Course course, @PathVariable String topicId) {
		courseService.addCourse(topicId, course);
		return "Course Addd";
	}
	
	@PutMapping("/topics/{topicId}/courses/{courseId}")
	public String updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String courseId) {
		courseService.updateCourse(topicId, courseId, course);
		return "Course Updated";
	}
	
	@DeleteMapping("/topics/{topicId}/courses/{courseId}")
	public String deleteCourse(@PathVariable String courseId) {
		courseService.deleteCourse(courseId);
		return "Course Deleted";
	}

}
