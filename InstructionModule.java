package codhisattva;

/*
* File: InstructionModule.java
* Author: Josh Rakow
* Date: June 27, 2018
* Purpose: This class holds and displays instuction.
*/

public class InstructionModule {
    private String[] loopInstruction;  //Holds the instruction.
    private int instructionIndex;  //Tracks the page the student is on, though the page is this index + 1.
    
    //Constructor
    public InstructionModule() {
        int instructionLength = 4;  //Holds the number of pages in the instruction.
        loopInstruction = new String[instructionLength];
        //Instruction should be entered here.
        loopInstruction[0] = "This is page 1 of the instruction (First page).";
        loopInstruction[1] = "This is page 2 of the instruction.";
        loopInstruction[2] = "This is page 3 of the instruction.";
        loopInstruction[3] = "This is page 4 of the instruction (Last page).";
        instructionIndex = 0;  //Start at beginning of instruction.
    }
    
    //This method outputs the appropriate page of instruction to the GUI.
    public void display(int instructionIndex) {
        //Note that the line below should be replaced with output to the appropriate GUI panel.
        System.out.println(loopInstruction[instructionIndex]);
    }
    
    //This method outputs the next page of instruction to the GUI.
    public void next() {
        //Note that the if/else is not necessary if we code the GUI so that the Next button is inaccessible when the end of
        //the instruction is reached.
        
        if (instructionIndex + 1 <= loopInstruction.length - 1) {
            instructionIndex++;
            display(instructionIndex);
        } else {
            System.out.println("You are already at the end of the instruction module.");
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
        //Code goes here to replace the instuctionPanel in the GUI with the mainPanel.
    }
}
