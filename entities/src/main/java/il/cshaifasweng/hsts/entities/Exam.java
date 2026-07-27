package il.cshaifasweng.hsts.entities;

import il.cshaifasweng.hsts.entities.enums.ExamStatus;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    //references//
    private Teacher teacher;
    private Course course;

    private List<ExamQuestion> examQuestions = new ArrayList<>();

//field//
    private String examId;
    private int duration;
    private String studentInstructions;
    private String teacherInstructions;
    private ExamStatus status;
    private String rejectionReason;


    protected Exam(){
    }

    public Exam(Course course, Teacher teacher, String examId, int duration, String studentInstructions,
                String teacherInstructions){
        this.course =course;
        this.teacher = teacher;
        this.examId = examId;
        this.duration = duration;
        this.studentInstructions = studentInstructions;
        this.teacherInstructions = teacherInstructions;

    }

    public Course getCourse() {
        return course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<ExamQuestion> getExamQuestions() {
        return examQuestions;
    }

    public String getExamId() {
        return examId;
    }

    public int getDuration() {
        return duration;
    }

    public String getStudentInstructions() {
        return studentInstructions;
    }

    public String getTeacherInstructions() {
        return teacherInstructions;
    }

    public ExamStatus getStatus() {
        return status;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }


    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setStudentInstructions(String studentInstructions) {
        this.studentInstructions = studentInstructions;
    }

    public void setTeacherInstructions(String teacherInstructions) {
        this.teacherInstructions = teacherInstructions;
    }

    public void setStatus(ExamStatus status) {
        this.status = status;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }







    public boolean isApproved(){
        return status == ExamStatus.APPROVED;
    }

    public boolean canBePublished(){
        return isApproved(); // maybe add more checks
    }

    public int calculateTotalPoints(){
        int totalPoints = 0;
        for(ExamQuestion examQuestion : examQuestions){
            totalPoints += examQuestion.getPoints();
        }
        return totalPoints;
    }

    public void addExamQuestion(ExamQuestion examQuestion) {
        examQuestions.add(examQuestion);
        examQuestion.setExam(this);
    }

    public void removeExamQuestion(ExamQuestion examQuestion) {
        if(examQuestions.remove(examQuestion)) {
            examQuestion.setExam(null);
        }
    }


}
