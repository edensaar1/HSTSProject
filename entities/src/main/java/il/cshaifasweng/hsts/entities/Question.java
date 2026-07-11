package il.cshaifasweng.hsts.entities;

import il.cshaifasweng.hsts.entities.enums.DifficultyLevel;

public class Question {
    private Course course;

    private String questionId;
    private String description;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correctAnswer;
    private String topic;
    private DifficultyLevel difficultyLevel;
    private String illustrationPath;

    public Question(Course course, String questionId, String description, String answer1, String answer2, String answer3,
                      String answer4, int correctAnswer, String topic, DifficultyLevel difficultyLevel,
                      String illustrationPath){
        this.course = course;
        this.questionId = questionId;
        this.description = description;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
        this.topic = topic;
        this.difficultyLevel = difficultyLevel;
        this.illustrationPath = illustrationPath;

    }

//GETTERS//

    public Course getCourse() {
        return course;
    }

    String getQuestionId(){
        return this.questionId;
    }

    public String getDescription() {
        return description;
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

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public String getTopic() {
        return topic;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getIllustrationPath() {
        return illustrationPath;
    }



//SETTERS//

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public void setIllustrationPath(String illustrationPath) {
        this.illustrationPath = illustrationPath;
    }

}
