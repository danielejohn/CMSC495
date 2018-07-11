/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package codhisattva;

import java.awt.*;
import javax.swing.*;



/*

* File: CodeTracingQuestion.java

* Author: Daniel John

* Date: June 28, 2018

* Purpose: Each member of this class holds an individual question in which the student

* must identify the times a loop operates and executes a certain action

* and end up with a final count.  Feedback is provided to the user for

* each incorrect answer to try to get them to the correct answer.

*/



/**

 * Revision History

 * 28 June 2019 - Initial CodeTracingQuestion file created by Daniel

 * 

 */

public class CodeTracingQuestion extends JPanel{

    //GUI elements
    
    Color baseBlue = new Color(0,51,102);
    JTextField _input;
    JLabel _question;
    JLabel _feedback;
    JButton _enter;
    
    // Class variables

    String question; // Holds the question

    int answer; // Holds the correct answer as an int

    /*

    * Holds the feedback line count that will start at 0 and increment each

    * time a student gets the answer incorrect to provide additional feedback

    * every time a wrong answer is selected

    */


    String[] feedback; // Holds the various lines of feedback

    

    /*

    * Constructor for the code tracing question

    */

    public CodeTracingQuestion(String question, int actualAnswer, String[] feedback) 

    {

        this.question = question;

        this.answer = actualAnswer;

        this.feedback = feedback;
        
        //GUI elements
        /*create panels for various GUI components
        allows me to use GridLayout without having those components take up 
        too much space
        */
        JPanel _inputPanel = new JPanel();
        _inputPanel.setBackground(baseBlue);
        JPanel _enterPanel = new JPanel();
        _enterPanel.setBackground(baseBlue);
        
        _question = new JLabel(question,SwingConstants.CENTER);
        _question.setForeground(Color.WHITE);
        
        _input = new JTextField("",20);
        _feedback = new JLabel("input",SwingConstants.CENTER);
        _feedback.setForeground(Color.WHITE);
        _enter = new JButton("Enter");
        
        _inputPanel.add(_input);
        _enterPanel.add(_enter);
        
        this.setLayout(new GridLayout(4,1,10,10));
        
        //initialize GUI
        this.setBackground(baseBlue);
        
        this.add(_question);
        this.add(_inputPanel);
        this.add(_feedback);
        this.add(_enterPanel);
        
    }

    

    /*

    * Method to display a code tracing question, will need to be displayed in the GUI

    */

    void display() 

    {

        System.out.println(question);

    }

    

    void feedback(){

        //will rewrite this method later
        //System.out.println(feedback[feedbackLineCount]);

    }

    

}
