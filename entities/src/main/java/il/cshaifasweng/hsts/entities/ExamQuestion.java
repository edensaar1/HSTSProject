package il.cshaifasweng.hsts.entities;

public class ExamQuestion {
    private Exam exam;
    private Question question;

    private int points;

    protected ExamQuestion(){
    }

    public ExamQuestion(Question question, int points){
        if (question == null) {
            throw new IllegalArgumentException("Question cannot be null");
        }
        this.question = question;
        setPoints(points);
    }


//Getters/Setters//
    public Exam getExam() {
        return exam;
    }

    public Question getQuestion() {
        return question;
    }

    public int getPoints() {
        return points;
    }



    void setExam(Exam exam) {
        this.exam = exam;
    }

    public void setPoints(int points) {
        if(points <= 0){
            throw new IllegalArgumentException("Points must be positive");
        }
        this.points = points;
    }

}
