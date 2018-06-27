/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmsc495final;

/**
 *
 * @author Daniel
 */
public class CodeTracingQuestion {
    
    // Variables to hold the question, answer, feedback line number, and feedback
    String question;
    int actualAnswer, feedbackLineCount;
    String[] feedback;
    
    public CodeTracingQuestion(String question) 
    {
        this.question = question;
    }
    
    void display() 
    {
        System.out.println(question);
    }
    
}
