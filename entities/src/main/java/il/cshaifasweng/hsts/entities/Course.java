package il.cshaifasweng.hsts.entities;

import java.util.List;

public class Course {
    private List<Question> questions;
    private String courseId;
    private String courseName;

    public Course(List<Question> questions, String courseId, String courseName){
        this.questions = questions;
        this.courseId = courseId;
        this.courseName = courseName;

    }

    public List<Question> getQuestions() {
        return questions;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }



    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
