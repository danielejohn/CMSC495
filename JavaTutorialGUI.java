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

/**
 *
 * @author lukem
 */
public class JavaTutorialGUI extends JFrame{

    /**
     * @param args the command line arguments
     */
    public JPanel[] contentPanel;
    JPanel mainPanel, headerPanel, navPanel, titlePanel;
    JLabel instructionLink, assessmentLink;
    Color baseBlue = new Color(0,51,102);
    OptionText title, home, nav;
    JTabbedPane navTabbedPane;
    String[] tutorialListArray = {"tutorial 1","tutorial 2","tutorial 3"};
    String[] assessmentListArray = {"Error ID", "Code Tracing", "Multiple Choice"};
    HomePanelMouseListener instructionLinkListener, assessmentLinkListener;
    panelType panelSelect;
    
    boolean navBool = false;
    enum panelType {
        homePanel, 
        instructionPanel, 
        assessmentPanel
    }
    public static void main(String[] args) {
        new JavaTutorialGUI();
    }
    
    JavaTutorialGUI(){
        initializeGUI();
    }
    
    public void makeContentPanels(){
        contentPanel = new JPanel[3];
        
        for(int i = 0; i < contentPanel.length; i++){
            contentPanel[i] = new JPanel();
        }
        
        //create homePanel
        
        contentPanel[0].setBackground(baseBlue);
        contentPanel[0].setLayout(new GridLayout(1,2));
        
        instructionLink = new JLabel("Tutorials", SwingConstants.CENTER);
        instructionLink.setForeground(Color.WHITE);
        instructionLink.setName("instructionLink");
        
        instructionLinkListener = new HomePanelMouseListener(instructionLink);
        instructionLink.addMouseListener(instructionLinkListener);
        
        assessmentLink = new JLabel("Assessments",SwingConstants.CENTER);
        assessmentLink.setForeground(Color.WHITE);
        assessmentLink.setName("assessmentLink");
        
        contentPanel[0].add(instructionLink);
        contentPanel[0].add(assessmentLink);
        
        assessmentLinkListener = new HomePanelMouseListener(assessmentLink);
        assessmentLink.addMouseListener(assessmentLinkListener);
        
        //create tutorial
        contentPanel[1].setBackground(baseBlue);
        JLabel tutorialText = new JLabel("Tutorial");
        tutorialText.setForeground(Color.WHITE);
        contentPanel[1].add(tutorialText);
        
        //create assessment
        contentPanel[2].setBackground(baseBlue);
        JLabel assessmentText = new JLabel("Assessment");
        assessmentText.setForeground(Color.WHITE);
        contentPanel[2].add(assessmentText);
        
    }
    
    JPanel makeHeaderPanel(){
       
        
        //initialize titlePanel and OptionPanel
        titlePanel = new JPanel();
        titlePanel.setBackground(Color.BLACK);
        JPanel optionPanel = new JPanel();
        optionPanel.setBackground(Color.BLACK);
        
        //initialize headerPanel
        headerPanel = new JPanel();
        headerPanel.setBackground(Color.BLACK);
        headerPanel.setLayout(new BorderLayout());
        
        //initialize title and add to titlePanel
        title = new OptionText("Java Tutorials");
        titlePanel.add(title);
        headerPanel.add(titlePanel, BorderLayout.WEST);
        
        //initialize home and nav and add to optionPanel
        home = new OptionText("home");
        home.setName("home");
        nav = new OptionText("nav");
        nav.setName("nav");
        
         //initializing mouse listener
        HeaderPanelMouseListener homeListener = new HeaderPanelMouseListener(home);
        HeaderPanelMouseListener navListener = new HeaderPanelMouseListener(nav);
        
        //adding mouseListenre
        home.addMouseListener(homeListener);
        nav.addMouseListener(navListener);
        
        optionPanel.add(home);
        optionPanel.add(nav);
        
        optionPanel.setLayout(new GridLayout(1,2,5,5));
        headerPanel.add(optionPanel, BorderLayout.EAST);
        
        return headerPanel;
        
    }
    
    void initializeGUI(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(1000,600);
        
        makeContentPanels();
        createNavPanel();
        mainPanel = new JPanel();
        navBool = true;
        panelSelect = panelType.homePanel;
        
        this.add(makeHeaderPanel(),BorderLayout.NORTH);
        
        createMainPanel();
        
        this.setVisible(true);
    }
    
    JPanel createNavPanel(){
        
        navPanel = new JPanel();
        navPanel.setLayout(new GridLayout(1,1));
        
        
        JList tutorialList = new JList(tutorialListArray);
        JScrollPane tutorialScrollPane = new JScrollPane(tutorialList);
        
        JList assessmentList = new JList(assessmentListArray);
        JScrollPane assessmentScrollPane = new JScrollPane(assessmentList);
        
        navTabbedPane = new JTabbedPane();
        
        navTabbedPane.addTab("Tutorials",tutorialScrollPane);
        navTabbedPane.addTab("Assessments",assessmentScrollPane);
        
        navPanel.add(navTabbedPane);
        
        
        return navPanel;
    }
    public void createMainPanel(){
        mainPanel.removeAll();
        if (navBool == false){
            mainPanel.setLayout(new GridLayout(1,1));
            if(panelSelect.equals(panelType.homePanel)){
                titlePanel.revalidate();
                titlePanel.repaint();
                titlePanel.validate();
                
                mainPanel.add(contentPanel[0]);
                contentPanel[0].revalidate();
                contentPanel[0].repaint();
                contentPanel[0].validate();
            }
            else if(panelSelect.equals(panelType.instructionPanel)){
                mainPanel.add(contentPanel[1]);
                contentPanel[1].revalidate();
                contentPanel[1].repaint();
                contentPanel[1].validate();
            }else if(panelSelect.equals(panelType.assessmentPanel)){
                mainPanel.add(contentPanel[2]);
                contentPanel[2].revalidate();
                contentPanel[2].repaint();
                contentPanel[2].validate();
            }
            
            mainPanel.revalidate();
            mainPanel.repaint();
            mainPanel.validate();
            
            this.revalidate();
            this.repaint();
            this.validate();
        }
        else if (navBool == true){
            mainPanel.setLayout(new GridLayout(1,2));
            if(panelSelect.equals(panelType.homePanel)){
                mainPanel.add(contentPanel[0]);
                contentPanel[0].revalidate();
                contentPanel[0].repaint();
                contentPanel[0].validate();
            }
            else if(panelSelect.equals(panelType.instructionPanel)){
                mainPanel.add(contentPanel[1]);
                contentPanel[1].revalidate();
                contentPanel[1].repaint();
                contentPanel[1].validate();
            }else if(panelSelect.equals(panelType.assessmentPanel)){
                mainPanel.add(contentPanel[2]);
                contentPanel[2].revalidate();
                contentPanel[2].repaint();
                contentPanel[2].validate();
            }
            mainPanel.add(navPanel);
            navPanel.revalidate();
            navPanel.repaint();
            navPanel.validate();
            
            this.revalidate();
            this.repaint();
            this.validate();
        }
        
        this.add(mainPanel);
        mainPanel.revalidate();
        this.revalidate();
    }
    class HomePanelMouseListener implements MouseListener{
        JLabel _ot;
        HomePanelMouseListener(JLabel ot){
            _ot = ot;
        }
        @Override
        public void mouseClicked(MouseEvent me) {
            if(_ot.getName().equals("instructionLink")){
                panelSelect = panelType.instructionPanel;
                createMainPanel();
            }else if(_ot.getName().equals("assessmentLink")){
                panelSelect = panelType.assessmentPanel;
                createMainPanel();
            }
            _ot.setForeground(Color.WHITE);
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            _ot.setForeground(Color.YELLOW);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            _ot.setForeground(Color.WHITE);
        }

    }
    public class HeaderPanelMouseListener implements MouseListener {

        OptionText _ot;
        HeaderPanelMouseListener(OptionText ot){
            _ot = ot;
        }
        @Override
        public void mouseClicked(MouseEvent me) {
            
            if(_ot.getName().equals("home")){
                panelSelect = panelType.homePanel;
                createMainPanel();
            }else if (_ot.getName().equals("nav")){
                navBool = !navBool;
                createMainPanel();
            }
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

 class OptionText extends JPanel{
    private JLabel label;
        OptionText(String title){
            label = new JLabel(title);
            label.setForeground(Color.white);
            label.setFont(new Font("Serif", Font.PLAIN, 16));
            label.setAlignmentX(Component.LEFT_ALIGNMENT);
            this.add(label);
            this.setBackground(Color.BLACK);
        }
        public void setFontSize(int x){
            label.setFont(new Font("Serif", Font.PLAIN, x));
        }
        public void setColor(Color color){
            label.setForeground(color);
        }
        public void setText(String t){
            label.setText(t);
        }
}