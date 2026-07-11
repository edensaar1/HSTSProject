package il.cshaifasweng.hsts.entities.view;

import il.cshaifasweng.hsts.entities.Question;

import java.util.List;

public class CourseView {
    private String courseId;
    private String courseName;

    public CourseView() {
    }


    public CourseView(String courseId, String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }




    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }




    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
