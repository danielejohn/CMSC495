/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codhisattva;

import java.util.Scanner;

/**
 * File: MultipleChoiceQuestion.java
 * @author Nate
 * Date: June 29, 2018
 * Purpose: This is multiple choice question test in which each student will 
 * have to identify the correct answer amongst 4 possible answers. Feedback
 * will be provided for the user for each correct answer given. 
 */

/**
 * Revision History
 * June 28, 2018 - Initial Multiple Choice file created by Nate. 
 */
public class MultipleChoiceQuestion {

    private static int score;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String[] multiChoice;
    Scanner input = new Scanner(System.in);

    // List of Questions
    
    multiChoice = new String[5];
    multiChoice[0] = "1. Question 1\n";
    multiChoice[1] = "2. Question 2\n";
    multiChoice[2] = "3. question 3\n";
    multiChoice[3] = "4. Question 4\n";
    multiChoice[4] = "5. Question 5\n";

    //Answers for question 1
    String userSelect1 = multiChoice[0];

    if(userSelect1 == null ? multiChoice[0] == null : userSelect1.equals(multiChoice[0])){
        System.out.println(multiChoice[0]);
        System.out.println("A. Answere1");
        System.out.println("B. Answere2");
        System.out.println("C. Answere3");
        System.out.println("D. Answere4");
        System.out.println();
        System.out.print("Your answer: ");
        String uSelect1 = input.next();

        char selection = uSelect1.toUpperCase().charAt(0);
if (selection == 'C') {
    score++;
    System.out.println("Correct!");
} else if ('A' <= selection && selection <= 'D') {
    System.out.println("Incorrect");
} else {
    System.out.println("Bad Input");
}
    }
    
    //Answers for question 2
String userSelect2 = multiChoice[1];

    if(userSelect1 == null ? multiChoice[1] == null : userSelect1.equals(multiChoice[1])){
        System.out.println(multiChoice[1]);
        System.out.println("A. Answere1");
        System.out.println("B. Answere2");
        System.out.println("C. Answere3");
        System.out.println("D. Answere4");
        System.out.println();
        System.out.print("Your answer: ");
        String uSelect1 = input.next();

        char selection = uSelect1.toUpperCase().charAt(0);
if (selection == 'B') {
    score++;
    System.out.println("Correct!");
} else if ('A' <= selection && selection <= 'D') {
    System.out.println("Incorrect");
} else {
    System.out.println("Bad Input");
}
        }
    
    //Answers for question 3
    String userSelect3 = multiChoice[2];

    if(userSelect1 == null ? multiChoice[2] == null : userSelect1.equals(multiChoice[2])){
        System.out.println(multiChoice[2]);
        System.out.println("A. Answere1");
        System.out.println("B. Answere2");
        System.out.println("C. Answere3");
        System.out.println("D. Answere4");
        System.out.println();
        System.out.print("Your answer: ");
        String uSelect1 = input.next();

        char selection = uSelect1.toUpperCase().charAt(0);
if (selection == 'B') {
    score++;
    System.out.println("Correct!");
} else if ('A' <= selection && selection <= 'D') {
    System.out.println("Incorrect");
} else {
    System.out.println("Bad Input");
}
    }
    
    //Answers for question 4
    String userSelect4 = multiChoice[3];

    if(userSelect1 == null ? multiChoice[3] == null : userSelect1.equals(multiChoice[3])){
        System.out.println(multiChoice[3]);
        System.out.println("A. Answere1");
        System.out.println("B. Answere2");
        System.out.println("C. Answere3");
        System.out.println("D. Answere4");
        System.out.println();
        System.out.print("Your answer: ");
        String uSelect1 = input.next();

        char selection = uSelect1.toUpperCase().charAt(0);
if (selection == 'B') {
    score++;
    System.out.println("Correct!");
} else if ('A' <= selection && selection <= 'D') {
    System.out.println("Incorrect");
} else {
    System.out.println("Bad Input");
}
    }
    
    //Answers for question 5
    String userSelect5 = multiChoice[4];

    if(userSelect1 == null ? multiChoice[4] == null : userSelect1.equals(multiChoice[4])){
        System.out.println(multiChoice[4]);
        System.out.println("A. Answere1");
        System.out.println("B. Answere2");
        System.out.println("C. Answere3");
        System.out.println("D. Answere4");
        System.out.println();
        System.out.print("Your answer: ");
        String uSelect1 = input.next();

        char selection = uSelect1.toUpperCase().charAt(0);
if (selection == 'B') {
    score++;
    System.out.println("Correct!");
} else if ('A' <= selection && selection <= 'D') {
    System.out.println("Incorrect");
} else {
    System.out.println("Bad Input");
            }
    }
    }
}