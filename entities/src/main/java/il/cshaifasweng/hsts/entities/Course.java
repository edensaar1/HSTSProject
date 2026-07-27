package il.cshaifasweng.hsts.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Subject subject;

    private String courseId;
    private String courseName;

    protected Course() {
    }

    public Course(Subject subject, String courseName){
        this.subject = subject;
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


    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}
