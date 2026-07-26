package il.cshaifasweng.hsts.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Subject subject;

    private String courseId;
    private String courseName;

    public Course(Subject subject, String courseId, String courseName){
        this.subject = subject;
        this.courseId = courseId;
        this.courseName = courseName;

    }


    public Subject getSubject() {
        return subject;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }


    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
