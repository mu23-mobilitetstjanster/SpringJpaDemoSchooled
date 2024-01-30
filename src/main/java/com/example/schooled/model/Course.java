package com.example.schooled.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor // these two can be removed in production
@Data
@Entity
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO) // AUTO_INCREMENT
  private Long id;

  private String title;
  private int duration;

}
