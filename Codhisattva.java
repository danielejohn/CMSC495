package codhisattva;

/*
* File: Codhisattva.java
* Author: Josh Rakow
* Date: June 27, 2018
* Purpose: This program serves to test the InstructionModule and ErrorIDQuestion
* classes and their methods.
*/

public class Codhisattva {

    public static void main(String[] args) {
        InstructionModule instructionModule = new InstructionModule();
        instructionModule.display(0);
        instructionModule.previous();
        instructionModule.next();
        instructionModule.next();
        instructionModule.previous();
        instructionModule.next();
        instructionModule.next();
        instructionModule.next();
        System.out.println("\n");
        
        int eIDQ1Length = 4;
        String[] eIDQ1Question = new String[eIDQ1Length];
        eIDQ1Question[0] = "This is line 1 of eIDQ1.";
        eIDQ1Question[1] = "This is line 2 of eIDQ1.";
        eIDQ1Question[2] = "This is line 3 of eIDQ1.";
        eIDQ1Question[3] = "This is line 4 of eIDQ1.";
        int[] eIDQ1LinesWithErrors = {2, 4};
        String[] eIDQ1Feedback = new String[eIDQ1Length];
        eIDQ1Feedback[0] = "You identified line 1 as containing an error.  This is incorrect because ...";
        eIDQ1Feedback[1] = "You identified line 2 as containing an error.  You are correct because ...";
        eIDQ1Feedback[2] = "You identified line 3 as containing an error.  This is incorrect because ...";
        eIDQ1Feedback[3] = "You identified line 4 as containing an error.  You are correct because ...";
        ErrorIDQuestion eIDQ1 = new ErrorIDQuestion(eIDQ1Question, eIDQ1LinesWithErrors, eIDQ1LinesWithErrors.length, eIDQ1Feedback);
        eIDQ1.display();
        int[] eIDQ1LinesSelected = {1, 2};
        eIDQ1.feedback(eIDQ1LinesSelected);
        eIDQ1LinesSelected[0] = 2;
        eIDQ1LinesSelected[1] = 4;
        eIDQ1.feedback(eIDQ1LinesSelected);
    }
    
}
