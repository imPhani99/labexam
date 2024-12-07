package com.labexam.jfsdlab;

import com.labexam.jfsdlab.model.Course;
import com.labexam.jfsdlab.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.labexam.jfsdlab.config.ApplicationConfig;

public class ClientDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Constructor injection demo
        Employee employee = context.getBean(Employee.class);
        System.out.println("Employee (Constructor Injection):");
        System.out.println(employee);

        // Autowiring with setter injection demo
        Course course = context.getBean(Course.class);
        System.out.println("\nCourse with Autowired Instructor (Setter Injection):");
        System.out.println(course);

        context.close();
    }
} 