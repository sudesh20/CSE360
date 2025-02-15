package hw2;

import java.util.ArrayList;

public class Answers {
    private ArrayList<Answer> answerList;

    // Constructor
    public Answers() {
        this.answerList = new ArrayList<>();
    }

    // Create a new answer for a specific question
    public void addAnswer(Answer answer) {
        answerList.add(answer);
    }

    // Read: Get all answers
    public ArrayList<Answer> getAnswers() {
        return answerList;
    }

    // Update: Mark answer as resolved
    public void markAnswerResolved(Answer answer) {
        answer.setResolved(true);
    }

    // Delete: Remove an answer
    public void deleteAnswer(Answer answer) {
        answerList.remove(answer);
    }

    // Get all answers for a specific question (assuming answers are always linked to the most recent question)
    public ArrayList<Answer> getAnswersForQuestion(int questionId) {
        ArrayList<Answer> answersForQuestion = new ArrayList<>();
        for (Answer a : answerList) {
            // Logic to link answers to specific questions can be added here
            // In this basic example, we assume all answers are for the latest question
            answersForQuestion.add(a);
        }
        return answersForQuestion;
    }
}
