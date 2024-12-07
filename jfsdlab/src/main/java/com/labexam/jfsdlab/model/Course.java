package com.labexam.jfsdlab.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Course {
    private Integer courseId;
    private String courseName;
    private Integer credits;
    private Instructor instructor;

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    @Autowired
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", instructor=" + instructor +
                '}';
    }
} 