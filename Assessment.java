/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package codhisattva;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




/*

* File: Assessment.java

* Author: Daniel John

* Date: June 28, 2018

* Purpose: This class contains the functionality to store the various question

* types and to hold the data that will be used to create the various tests.

*/



/**

 * Revision History

 * 28 June 2019 - Initial Assessment file created by Daniel with test arrays to 

 * test the various method calls against fake data

 * 10 July 2018 Luke Markwordt Added GUI Components

 */

public class Assessment extends JPanel{

    

    /* 

    * Notes to self: 

    * 1. Does this need a constructor built at some point?

    * 2. Do the index values for questions need to start at 0 when initialized?

    */

    // Create arrays to store the various question types using class objects
    
    private CodeTracingQuestion[] codeTracingQuestions = new CodeTracingQuestion[25];

    private ErrorIDQuestion[] errorIDQuestions;

    Color baseBlue = new Color(0,51,102);
    
    //private MultipleChoiceQuestion[] multipleChoiceQuestions;
    
    //links for AssessmentHomePanel
    
    JLabel codeTracingLink, errorIDLink, multipleChoiceLink;
    
    /*enum assessmentType {
        nill,
        home,
        multipleChoice,
        errorID,
        codeTracing
    }

    assessmentType assessmentSelect = assessmentType.nill;*/
    
    public Assessment(){
         //initializing Links
         
         codeTracingLink = new JLabel("Code Tracing Questions",SwingConstants.CENTER);
         errorIDLink = new JLabel("Error Identification Questions",SwingConstants.CENTER);
         multipleChoiceLink = new JLabel("Multiple Choice Questions",SwingConstants.CENTER);
         
         codeTracingLink.setForeground(Color.WHITE);
         errorIDLink.setForeground(Color.WHITE);
         multipleChoiceLink.setForeground(Color.WHITE);
         
         codeTracingLink.addMouseListener(new LinkListener(codeTracingLink));
         errorIDLink.addMouseListener(new LinkListener(errorIDLink));
         multipleChoiceLink.addMouseListener(new LinkListener(multipleChoiceLink));
         
         codeTracingLink.setName("codeTracingLink");
         errorIDLink.setName("errorIDLink");
         multipleChoiceLink.setName("multipleChoiceLink");
         
         //setting layout
        this.setLayout(new GridLayout(1,1)); 
        
        createHomePanel();
    }
    

    /*

    * Theoretical method used to fill each appropriate test.  Will likely

    * change as progress on the program continues.

    */

    //removed by Luke Markwordt
    /*
    public void fillTest()

    {

        String[] feedbackQuestionOne = {"Incorrect", "Correct"};

        CodeTracingQuestion codeTracingQuestion1 = new CodeTracingQuestion(

                "what would you do for a Klondike bar?", 0,0,feedbackQuestionOne);

        codeTracingQuestions[0] = codeTracingQuestion1;

    }
    */
    

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

    public void createHomePanel(){
        //creating masterPanel
        JPanel masterPanel = new JPanel();
        masterPanel.setBackground(baseBlue);
        masterPanel.setLayout(new GridLayout(2,1));
        JLabel title = new JLabel("Assessment Modules", SwingConstants.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial",Font.BOLD,30));
        masterPanel.add(title);
        //creating LinkPanel
        JPanel linkPanel = new JPanel();
        linkPanel.setBackground(baseBlue);
        linkPanel.setLayout(new GridLayout(3,1));
        linkPanel.add(multipleChoiceLink);
        linkPanel.add(errorIDLink);
        linkPanel.add(codeTracingLink);
        
        masterPanel.add(linkPanel);
        
        try{
            this.removeAll();
        }catch(Exception e){
            
        }
        
        this.add(masterPanel);
        
        this.revalidate();
        this.validate();
        this.repaint();
             
    }
    public void createCodeTracingPanel(){
        
        String[] arr= {
            "Hello", "you", "are", "special"
        };
        
        try{
            this.removeAll();
        }catch(Exception e){
            
        }
        
        this.add(new CodeTracingQuestion("question 1234", 4,arr));
        
        this.revalidate();
        this.validate();
        this.repaint();
        
        
    }
    
    public void  createMultipleChoicePanel(){
        
        String question = "what is the meaning of life";
        String[] choices = {"Choice A","Choice B","Choice C", "Choice D"};
        int answer = 1;
        String[] feedback = {"That","Was","A","Good","Choice"};
        
        
        try{
            this.removeAll();
        }catch(Exception e){
            
        }
        
        this.add(new MultipleChoiceQuestion(question,choices,answer,feedback));
        
        this.revalidate();
        this.validate();
        this.repaint();
        
    }
    public void createErrorIDPanel(){
        
        String question = "question"; 
        
        int[] in = {
        1,2,3,4
        };
        
        String[] feed = {
          "this","is","feedback"  
        };
        
        
        try{
            this.removeAll();
        }catch(Exception e){
            
        }
        
        this.add(new ErrorIDQuestion(question, 4, feed));
        
        this.revalidate();
        this.validate();
        this.repaint();
    }
    
    class LinkListener implements MouseListener{

        JLabel _label;
        
        LinkListener(JLabel label){
            _label = label;
        }
        @Override
        public void mouseClicked(MouseEvent me) {
            if(_label.getName().equals("multipleChoiceLink")){
                createMultipleChoicePanel();
            }
            else if(_label.getName().equals("errorIDLink")){
                createErrorIDPanel();
            }
            else if(_label.getName().equals("codeTracingLink")){
                createCodeTracingPanel();
            }
            _label.setForeground(Color.WHITE);
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            _label.setForeground(Color.YELLOW);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            _label.setForeground(Color.WHITE);
        }
        
    }
}
