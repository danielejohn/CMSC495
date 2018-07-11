/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package codhisattva;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;



/*

* File: InstructionModule.java

* Author: Josh Rakow

* Date: June 27, 2018

* Purpose: This class holds and displays instuction.

*/



/**

 * Revision History

 * 28 June 2019 - Initial CodeTracingQuestion file created by Josh

 * 

 */



public class InstructionModule extends JPanel{

    private String[] loopInstruction;  //Holds the instruction.

    private int instructionIndex;  //Tracks the page the student is on, though the page is this index + 1.

    Color baseBlue = new Color(0,51,102);
    
    JavaTutorialGUI _jTG;

    //Constructor

    public InstructionModule(JavaTutorialGUI jTG) {
        
        _jTG = jTG;

        int instructionLength = 4;  //Holds the number of pages in the instruction.

        loopInstruction = new String[instructionLength];

        //Instruction should be entered here.

        loopInstruction[0] = "This is page 1 of the instruction (First page).";

        loopInstruction[1] = "This is page 2 of the instruction.";

        loopInstruction[2] = "This is page 3 of the instruction.";

        loopInstruction[3] = "This is page 4 of the instruction (Last page).";

        instructionIndex = 0;  //Start at beginning of instruction.
        
        this.setBackground(baseBlue);
        
        mainMenu();

    }

    

    //This method outputs the appropriate page of instruction to the GUI.

    public void display(int instructionIndex) {

        //Note that the line below should be replaced with output to the appropriate GUI panel.

        this.removeAll();
        this.add(new JTextField(loopInstruction[instructionIndex]));
        this.revalidate();
        this.repaint();
        this.validate();

    }

    

    //This method outputs the next page of instruction to the GUI.

    public void next() {

        //Note that the if/else is not necessary if we code the GUI so that the Next button is inaccessible when the end of

        //the instruction is reached.
        
        

        if (instructionIndex + 1 <= loopInstruction.length - 1) {

            instructionIndex++;

            display(instructionIndex);

        } else {

            this.removeAll();
            
            JLabel end = new JLabel("Hello You are already at the end of the instruction module");
            end.setForeground(Color.WHITE);
            this.add(end);
            
            this.repaint();
            this.revalidate();
            this.validate();

        }

        

    }

    

    //This method outputs the previous page of instruction to the GUI.

    public void previous() {

        //Note that the if/else is not necessary if we code the GUI so that the Previous button is inaccessible when

        //starting the instruction.

        

        if (instructionIndex - 1 >= 0) {

            instructionIndex--;

            display(instructionIndex);

        } else {

            System.out.println("You are already at the beginning of the instruction module.");

        }

        

    }

    

    //This method returns the user to the main menu.

    public void mainMenu() {

        this.removeAll();
        JLabel tutorials = new JLabel("Tutorials");
        tutorials.setForeground(Color.WHITE);
        
        OptionText begin = new OptionText("Begin",baseBlue);
        begin.setName("begin");
        begin.addMouseListener(new InstructionPanelMouseListener(begin,this));
        
        this.add(tutorials);
        this.add(begin);
        
        this.repaint();
        this.validate();
        this.revalidate();

    }
    
    private class InstructionPanelMouseListener implements MouseListener {



        OptionText _ot;
        InstructionModule _im;

        InstructionPanelMouseListener(OptionText ot, InstructionModule im){

            _ot = ot;
            _im = im;

        }

        @Override

        public void mouseClicked(MouseEvent me) {

            instructionIndex = 0;
            _im.display(instructionIndex);

            _ot.setColor(Color.WHITE);

        }



        @Override

        public void mousePressed(MouseEvent me) {

        }



        @Override

        public void mouseReleased(MouseEvent me) {

        }



        @Override

        public void mouseEntered(MouseEvent me) {

            _ot.setColor(Color.YELLOW);

        }



        @Override

        public void mouseExited(MouseEvent me) {

            _ot.setColor(Color.WHITE);

        }



}

}





