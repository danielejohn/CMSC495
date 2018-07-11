/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codhisattva;

/**
 *
 * @author lukem
 */

import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends JPanel{
    
    //structure
    String question;
    //these choices will be formated as multiple choice questions
    String[] choice;
    //will be the index of the correct answer in choices
    int answer;
    String[] feedback;
    
    //GUI components
    Color baseBlue = new Color(0,51,102);
    
    JButton _aButton;
    JButton _bButton;
    JButton _cButton;
    JButton _dButton;
    
    JLabel _aLabel;
    JLabel _bLabel;
    JLabel _cLabel;
    JLabel _dLabel;
    
    JTextArea _question;
    JLabel _feedback;
    
    public MultipleChoiceQuestion(String question, String[] choice, int answer, String [] feedback){
        
        //structure
        this.question = question;
        this.choice = choice;
        this.answer = answer;
        this.feedback = feedback;
        
        //GUI Components
        this.setBackground(baseBlue);
        this.setLayout(new GridLayout(3,1));
        
        _aButton = new JButton("A");
        _bButton = new JButton("B");
        _cButton = new JButton("C");
        _dButton = new JButton("D");
        
        //creating Panels for buttons so they are not resized in GridLayout
        JPanel _aButtonPanel = new JPanel();
        JPanel _bButtonPanel = new JPanel();
        JPanel _cButtonPanel = new JPanel();
        JPanel _dButtonPanel = new JPanel();
        
        _aButtonPanel.setBackground(baseBlue);
        _bButtonPanel.setBackground(baseBlue);
        _cButtonPanel.setBackground(baseBlue);
        _dButtonPanel.setBackground(baseBlue);
        
        _aButtonPanel.add(_aButton);
        _bButtonPanel.add(_bButton);
        _cButtonPanel.add(_cButton);
        _dButtonPanel.add(_dButton);
        
        _aLabel = new JLabel(choice[0]);
        _bLabel = new JLabel(choice[1]);
        _cLabel = new JLabel(choice[2]);
        _dLabel = new JLabel(choice[3]);
        
        _aLabel.setForeground(Color.white);
        _bLabel.setForeground(Color.white);
        _cLabel.setForeground(Color.white);
        _dLabel.setForeground(Color.white);
        
        _question = new JTextArea(question);
        _feedback = new JLabel("feedback",SwingConstants.CENTER);
        _feedback.setForeground(Color.WHITE);
        
        this.add(_question);
        
        //create structure for multiple choice panel
        JPanel _multipleChoicePanel = new JPanel();
        _multipleChoicePanel.setLayout(new GridLayout(2,2,50,50));
        _multipleChoicePanel.setBackground(baseBlue);
        
        JPanel _panelA = new JPanel();
        JPanel _panelB = new JPanel();
        JPanel _panelC = new JPanel();
        JPanel _panelD = new JPanel();
        
        _panelA.setBackground(baseBlue);
        _panelB.setBackground(baseBlue);
        _panelC.setBackground(baseBlue);
        _panelD.setBackground(baseBlue);
        
        _panelA.setLayout(new GridLayout(1,2,10,10));
        _panelB.setLayout(new GridLayout(1,2,10,10));
        _panelC.setLayout(new GridLayout(1,2,10,10));
        _panelD.setLayout(new GridLayout(1,2,10,10));
        
        _panelA.add(_aButtonPanel);
        _panelA.add(_aLabel);
        
        _panelB.add(_bButtonPanel);
        _panelB.add(_bLabel);
        
        _panelC.add(_cButtonPanel);
        _panelC.add(_cLabel);
        
        _panelD.add(_dButtonPanel);
        _panelD.add(_dLabel);
        
        _multipleChoicePanel.add(_panelA);
        _multipleChoicePanel.add(_panelB);
        _multipleChoicePanel.add(_panelC);
        _multipleChoicePanel.add(_panelD);
        
        this.add(_multipleChoicePanel);
        
        //adding _feedback to mainPanel
        this.add(_feedback);
    }
    
}
