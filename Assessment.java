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
public class Assessment {
    
    /* 
    * Notes to self: 
    * 1. Does this need a constructor built at some point?
    * 2. Do the index values for questions need to start at 0 when initialized?
    */
    
    // Create arrays to store the various question types using class objects
    private CodeTracingQuestion[] codeTracingQuestions = new CodeTracingQuestion[25];
    //private ErrorIDQuestion[] errorIDQuestions;
    //private MultipleChoiceQuestion[] multipleChoiceQuestions;
    
    // Test array and index
    private String[] testQuestions = {"what would you do for a Klondike bar?",
            "How many licks to get to the center of a tootsie pop?"};
    private int testQuestionIndex = 0;
    
    public void fillTest()
    {
        CodeTracingQuestion codeTracingQuestion1 = new CodeTracingQuestion(
                "what would you do for a Klondike bar?");
        codeTracingQuestions[0] = codeTracingQuestion1;
    }
    
   // Variables local to this class to track the question number a user is on
    private int codeTracingQuestionIndex, errorIDQuestionIndex, 
            multipleChoiceQuestionIndex = 0;
    
    /**
     * Method to display code tracing questions and increment the index once a
     * question has been completed
     */
    public void displayCodeTracingQuestions() 
    {
        codeTracingQuestions[codeTracingQuestionIndex].display();
        codeTracingQuestionIndex++;
    }
    
    /**
     * Method to display error ID questions and increment the index once a
     * question has been completed
     */
    public void displayErrorIdQuestions() 
    {
    //    errorIDQuestions[errorIDQuestionIndex].display();
        errorIDQuestionIndex++;
    }
    
    /**
     * Method to display multiple choice questions and increment the index once a
     * question has been completed
     */
    public void displayMultipleChoiceQuestions() 
    {
    //    multipleChoiceQuestions[multipleChoiceQuestionIndex].display();
        multipleChoiceQuestionIndex++;
    }
    
    // Test versions of methods
    public void displayTestDataQuestions()
    {
        System.out.println(testQuestions[testQuestionIndex]);
    }
        
}
