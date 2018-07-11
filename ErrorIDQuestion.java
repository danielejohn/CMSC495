

package codhisattva;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/*

* File: ErrorIDQuestion.java

* Author: Josh Rakow

* Date: June 28, 2018

* Purpose: Each member of this class holds an individual question in which the student

* must identify the lines that contain errors.  Feedback is provided to the user for

* each line that s/he identfies.

*/



/**

 * Revision History

 * 28 June 2019 - Initial CodeTracingQuestion file created by Josh

 * 

 */

public class ErrorIDQuestion extends JPanel{

    private String question;  //Holds the question.

    int[] linesWithErrors;  //Holds the line numbers that contain errors.
    
    //removed by Luke Markwordt
    /*
    int numberOfErrors;  //Holds the number of errors.
    */
    String[] feedback;  //Holds feedback for the user.  Each array element is the feedback for the correponding element in the question array.

    //GUI Components
    Color baseBlue = new Color(0,51,102);
    JTextArea _question;
    JTextField _input;
    JLabel _feedback;
    JButton _enter;
    

    public ErrorIDQuestion(String question, int numberOfErrors, String[] feedback){

        this.question = question;

        this.linesWithErrors = linesWithErrors;

        this.feedback = feedback;

        
        //GUI components
        _question = new JTextArea();
        _input = new JTextField("",40);
        _feedback = new JLabel("Feedback",SwingConstants.CENTER);
        _feedback.setForeground(Color.WHITE);
        _enter = new JButton("Enter");
        //JPanels for elements to be put in GridLayout
        JPanel _inputPanel = new JPanel();
        _inputPanel.add(_input);
        _inputPanel.setBackground(baseBlue);
        JPanel _enterPanel = new JPanel();
        _enterPanel.add(_enter);
        _enterPanel.setBackground(baseBlue);
        
        this.add(_question);
        this.add(_inputPanel);
        this.add(_feedback);
        this.add(_enterPanel);
        
        this.setBackground(baseBlue);
        this.setLayout(new GridLayout(4,1));
    }

    
    //method is no longer necessary
    
    /*
    public void display() {

        for (int i = 0; i < question.length; i++) {

            //Note that the line below will need to both output to the GUI and create a checkbox for each line.

            System.out.println(question[i]);

        }

    }
    */
    
    

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