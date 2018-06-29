/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codhisattva;

/*
* File: CodeTracingQuestion.java
* Author: Daniel John
* Date: June 28, 2018
* Purpose: Each member of this class holds an individual question in which the student
* must identify the times a loop operates and executes a certain action
* and end up with a final count.  Feedback is provided to the user for
* each incorrect answer to try to get them to the correct answer.
*/
public class CodeTracingQuestion {
    
    // Class variables
    String question; // Holds the question
    int actualAnswer; // Holds the correct answer as an int
    /*
    * Holds the feedback line count that will start at 0 and increment each
    * time a student gets the answer incorrect to provide additional feedback
    * every time a wrong answer is selected
    */
    int feedbackLineCount;
    String[] feedback; // Holds the various lines of feedback
    
    /*
    * Constructor for the code tracing question
    */
    public CodeTracingQuestion(String question, int actualAnswer,
            int feedbackLineCount, String[] feedback) 
    {
        this.question = question;
        this.actualAnswer = actualAnswer;
        this.feedbackLineCount = feedbackLineCount;
        this.feedback = feedback;
    }
    
    /*
    * Method to display a code tracing question, will need to be displayed in the GUI
    */
    void display() 
    {
        System.out.println(question);
    }
    
    void feedback(){
        System.out.println(feedback[feedbackLineCount]);
    }
    
}
