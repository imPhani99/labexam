package com.labexam.jfsdlab.config;

import com.labexam.jfsdlab.model.Course;
import com.labexam.jfsdlab.model.Employee;
import com.labexam.jfsdlab.model.Instructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ApplicationConfig {

    @Bean
    public Employee employee() {
        return new Employee(
                1001,
                "John Doe",
                75000.0,
                "IT",
                Arrays.asList("Java", "Spring", "SQL")
        );
    }

    @Bean
    public Instructor instructor() {
        Instructor instructor = new Instructor();
        instructor.setInstructorId(2001);
        instructor.setName("Jane Smith");
        instructor.setEmail("jane.smith@example.com");
        instructor.setPhoneNumber("123-456-7890");
        return instructor;
    }

    @Bean
    public Course course() {
        Course course = new Course();
        course.setCourseId(3001);
        course.setCourseName("Advanced Spring Framework");
        course.setCredits(3);
        return course;
    }
} 