package com.example.schooled;

import com.example.schooled.model.Course;
import com.example.schooled.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchooledApplication {

  public static void main(String[] args) {
    SpringApplication.run(SchooledApplication.class, args);
  }


  @Bean
  public CommandLineRunner run(CourseRepository courseRepository) {
    return args -> {
      courseRepository.save(new Course(1l, "Math", 20));
      courseRepository.save(new Course(2l, "Physics", 25));
      courseRepository.save(new Course(3l, "Biology", 35));
    };
  }
}
