package il.cshaifasweng.hsts.entities.view;

import il.cshaifasweng.hsts.entities.enums.DifficultyLevel;

import java.io.Serializable;

public class QuestionView implements Serializable {
    private String courseId;

    private String questionId;
    private String text;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;


    public QuestionView(){
    }


    public QuestionView(String courseId, String questionId, String text, String answer1, String answer2,
                        String answer3, String answer4){
        this.courseId = courseId;
        this.questionId = questionId;
        this.text = text;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;

    }

    //GETTERS//


    public String getCourseId() {
        return courseId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public String getText() {
        return text;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    //SETTERS//


    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }


}
