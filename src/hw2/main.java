package hw2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Create instances of Questions and Answers classes
        Questions questions = new Questions();
        Answers answers = new Answers();
        Scanner scanner = new Scanner(System.in);

        // Ask user for the action to perform (Create, Read, Update, Delete)
        while (true) {
            System.out.println("\nChoose an action: ");
            System.out.println("1. Create a Question");
            System.out.println("2. View Unresolved Questions");
            System.out.println("3. Update Unread Answers");
            System.out.println("4. Delete a Question");
            System.out.println("5. Create an Answer");
            System.out.println("6. View Answers for a Specific Question");
            System.out.println("7. Mark Answer as Resolved");
            System.out.println("8. Delete an Answer");
            System.out.println("9. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline character

            switch (choice) {
                case 1:
                    // Create a new question
                    System.out.print("Enter your question: ");
                    String questionText = scanner.nextLine();
                    questions.addQuestion(questionText);
                    System.out.println("Question added!");
                    break;

                case 2:
                    // View unresolved questions
                    System.out.println("Unresolved Questions:");
                    for (Question q1 : questions.getUnresolvedQuestions()) {
                        System.out.println(q1);
                    }
                    break;

                case 3:
                    // Update unread answers count for a question
                    System.out.print("Enter the question ID to update: ");
                    int questionIdToUpdate = scanner.nextInt();
                    System.out.print("Enter the new unread answer count: ");
                    int unreadAnswers = scanner.nextInt();
                    questions.updateUnreadAnswers(questionIdToUpdate, unreadAnswers);
                    System.out.println("Updated unread answers for the question!");
                    break;

                case 4:
                    // Delete a question
                    System.out.print("Enter the question ID to delete: ");
                    int questionIdToDelete = scanner.nextInt();
                    questions.deleteQuestion(questionIdToDelete);
                    System.out.println("Question deleted!");
                    break;

                case 5:
                    // Create an answer for a specific question
                    System.out.print("Enter the question ID to answer: ");
                    int questionIdForAnswer = scanner.nextInt();
                    scanner.nextLine();  // consume the newline character
                    System.out.print("Enter your answer: ");
                    String answerText = scanner.nextLine();
                    Answer a = new Answer(answerText);
                    answers.addAnswer(a);
                    System.out.println("Answer added!");
                    break;

                case 6:
                    // View all answers for a specific question
                    System.out.print("Enter the question ID to view answers: ");
                    int questionIdToView = scanner.nextInt();
                    System.out.println("Answers for Question ID " + questionIdToView + ":");
                    for (Answer a1 : answers.getAnswersForQuestion(questionIdToView)) {
                        System.out.println(a1);
                    }
                    break;

                case 7:
                    // Mark an answer as resolved
                    System.out.print("Enter the answer to mark as resolved: ");
                    String answerToMark = scanner.nextLine();
                    for (Answer a2 : answers.getAnswers()) {
                        if (a2.getAnswerText().equalsIgnoreCase(answerToMark)) {
                            answers.markAnswerResolved(a2);
                            System.out.println("Answer marked as resolved!");
                            break;
                        }
                    }
                    break;

                case 8:
                    // Delete an answer
                    System.out.print("Enter the answer to delete: ");
                    String answerToDelete = scanner.nextLine();
                    for (Answer a3 : answers.getAnswers()) {
                        if (a3.getAnswerText().equalsIgnoreCase(answerToDelete)) {
                            answers.deleteAnswer(a3);
                            System.out.println("Answer deleted!");
                            break;
                        }
                    }
                    break;

                case 9:
                    // Exit
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
