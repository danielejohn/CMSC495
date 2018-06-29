/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codhisattva;

import java.util.Arrays;

/*
* File: ErrorIDQuestion.java
* Author: Josh Rakow
* Date: June 28, 2018
* Purpose: Each member of this class holds an individual question in which the student
* must identify the lines that contain errors.  Feedback is provided to the user for
* each line that s/he identfies.
*/

public class ErrorIDQuestion {
    private String[] question;  //Holds the question.
    int[] linesWithErrors;  //Holds the line numbers that contain errors.
    int numberOfErrors;  //Holds the number of errors.
    String[] feedback;  //Holds feedback for the user.  Each array element is the feedback for the correponding element in the question array.
    
    public ErrorIDQuestion(String[] question, int[] linesWithErrors, int numberOfErrors, String[] feedback) {
        this.question = question;
        this.linesWithErrors = linesWithErrors;
        this.numberOfErrors = numberOfErrors;
        this.feedback = feedback;
    }
    
    public void display() {
        for (int i = 0; i < question.length; i++) {
            //Note that the line below will need to both output to the GUI and create a checkbox for each line.
            System.out.println(question[i]);
        }
    }
    
    //Note that it is necessary for linesSelected and linesWithErrors to be sorted in increasing order for the array comparison to work in all cases.
    public void feedback(int[] linesSelected) {
        for(int line:linesSelected) {
            System.out.println(feedback[line-1]);
        }
        if(Arrays.equals(linesSelected, linesWithErrors)) {
            System.out.println("You have answered this question correctly!  You may move on to the next question if you choose to do so.");
            //Button should be enabled to move on to the next question.
        } else {
            System.out.println("Please try this quuestion again.");
        }
    } 
    
}