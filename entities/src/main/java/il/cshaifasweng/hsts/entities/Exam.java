package il.cshaifasweng.hsts.entities;

import il.cshaifasweng.hsts.entities.enums.ExamStatus;

import java.util.List;

public class Exam {
    //references//
    private Teacher teacher;
    private Course course;
    private ExamGenerationCriteria criteria;
    private List<ExamInstance> examInstances;
    private List<ExamQuestion> examQuestions;


    private String examId;
    private int duration;
    private String studentInstructions;
    private String teacherInstructions;
    private ExamStatus status;
    private String rejectionReason;



    public Exam(String examId, int duration, String studentInstructions, String teacherInstructions,
                ExamStatus status, String rejectionReason){

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
        //later//
        return 1;
    }





}
