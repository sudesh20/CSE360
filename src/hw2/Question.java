package hw2;

public class Question {
    private int id;
    private String questionText;
    private int unreadAnswers;

    // Constructor
    public Question(int id, String questionText) {
        this.id = id;
        this.questionText = questionText;
        this.unreadAnswers = 0;
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getUnreadAnswers() {
        return unreadAnswers;
    }

    public void setUnreadAnswers(int unreadAnswers) {
        this.unreadAnswers = unreadAnswers;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Question: " + questionText + " | Unread Answers: " + unreadAnswers;
    }
}
