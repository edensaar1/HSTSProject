package il.cshaifasweng.hsts.entities;

import il.cshaifasweng.hsts.entities.enums.DifficultyLevel;

import java.util.List;

public class ExamGenerationCriteria {
    private int numOfQuestions;
    private List<String> topics;
    private DifficultyLevel difficultyLevel;

    public ExamGenerationCriteria(int numOfQuestions, List<String> topics, DifficultyLevel difficultyLevel){
        this.numOfQuestions = numOfQuestions;
        this.topics = topics;
        this.difficultyLevel = difficultyLevel;
    }

    public int getNumOfQuestions() {
        return numOfQuestions;
    }

    public List<String> getTopics() {
        return topics;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }


    public void setNumOfQuestions(int numOfQuestions) {
        this.numOfQuestions = numOfQuestions;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
