/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codhisattva;

/*
* File: Codhisattva.java
* Author: Josh Rakow
* Date: June 27, 2018
* Purpose: This program serves to test the InstructionModule and ErrorIDQuestion
* classes and their methods.
*/

/**
 * Revision History
 * 27 June 2019 - File created by Josh
 * 29 June 2019 - Merged Daniel main.java tests into this file and removed the
 * main now that our GitHub is up and running
 * 
 */

public class Codhisattva {

    public static void main(String[] args) {
        
        // Begin Josh's Tests
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
        // End Josh's Tests
        System.out.println("\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        // Begin Daniel's Tests
        Assessment assessment = new Assessment();
        assessment.fillTest();
        assessment.displayCodeTracingQuestions();
        // End Daniel's Tests
    }
    
}
