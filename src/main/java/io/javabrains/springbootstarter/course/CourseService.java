package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.topic.Topic;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository repository;

	public List<Course> getAllCourses(String topicId) {
		return repository.findByTopicId(topicId);
	}

	public Course getCourseDetail(String courseId) {
		return repository.findOne(courseId);
	}

	public void addCourse(String topicId, Course course) {
		course.setTopic(new Topic(topicId, "", ""));
		repository.save(course);
	}

	public void updateCourse(String topicId, String courseId, Course course) {
		course.setTopic(new Topic(topicId, "", ""));
		repository.save(course);
	}

	public void deleteCourse(String courseId) {
		repository.delete(courseId);
	}

}
