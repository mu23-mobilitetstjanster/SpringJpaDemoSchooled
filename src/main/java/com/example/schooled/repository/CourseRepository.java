package com.example.schooled.repository;

import com.example.schooled.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

  // SELECT * FROM course WHERE title=?
  Course findCourseByTitle(String title);


  // SELECT * FROM course LIKE title=?
  Course findCourseByTitleContains(String title);
}