package hw2;

import java.util.ArrayList;

public class Questions {
    private ArrayList<Question> questionList;
    private int nextId;

    // Constructor
    public Questions() {
        this.questionList = new ArrayList<>();
        this.nextId = 1;  // Start the IDs from 1
    }

    // Create a new question
    public void addQuestion(String questionText) {
        Question newQuestion = new Question(nextId, questionText);
        questionList.add(newQuestion);
        nextId++;  // Increment the ID for the next question
    }

    // Read: Retrieve list of unresolved questions
    public ArrayList<Question> getUnresolvedQuestions() {
        return questionList;
    }

    // Find question by ID
    public Question getQuestionById(int id) {
        for (Question q : questionList) {
            if (q.getId() == id) {
                return q;
            }
        }
        return null;  // Return null if not found
    }

    // Update: Update unread answer count for a question
    public void updateUnreadAnswers(int questionId, int unreadAnswers) {
        Question q = getQuestionById(questionId);
        if (q != null) {
            q.setUnreadAnswers(unreadAnswers);
        }
    }

    // Delete: Remove a question
    public void deleteQuestion(int questionId) {
        Question q = getQuestionById(questionId);
        if (q != null) {
            questionList.remove(q);
        }
    }
}

