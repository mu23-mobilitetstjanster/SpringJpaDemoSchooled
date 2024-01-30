package com.example.schooled.controller;

import com.example.schooled.model.Course;
import com.example.schooled.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

  @Autowired
  private CourseService courseService;

  @GetMapping
  public List<Course> getAllCourses() {
    return courseService.getAll();
  }

  @GetMapping("/search/{title}")
  public Course getCourseByTitle(@PathVariable String title) {
    return courseService.getCourseByTitle(title);
  }

  @PostMapping
  public String createNewCourse(@RequestBody Course course) {
    courseService.create(course);

    return "Success";
  }
}
