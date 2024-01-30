package com.example.schooled.service;

import com.example.schooled.model.Course;
import com.example.schooled.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

  @Autowired
  private CourseRepository courseRepository;

  public List<Course> getAll() {
    return courseRepository.findAll();
  }

  public void create(Course course) {
    courseRepository.save(course);
  }

  // SELECT * FROM course WHERE title=?
  public Course getCourseByTitle(String title) {
    return courseRepository.findCourseByTitle(title);
  }
}
