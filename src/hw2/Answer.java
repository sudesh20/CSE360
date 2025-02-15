package hw2;

public class Answer {
    private String answerText;
    private boolean resolved;

    // Constructor
    public Answer(String answerText) {
        this.answerText = answerText;
        this.resolved = false;  // Initially, answer is not resolved
    }

    // Getter and setter methods
    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    @Override
    public String toString() {
        return "Answer: " + answerText + " | Resolved: " + resolved;
    }
}
