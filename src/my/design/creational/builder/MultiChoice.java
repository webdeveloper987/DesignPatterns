package my.design.creational.builder;

import java.util.List;

import javax.swing.JPanel;


public abstract class MultiChoice { 
    //the abstract base class 
    //from which the list box and check box choice panels 
    //are derived 
    protected final List<String> choices;           //array of labels 
    public MultiChoice(List<String> choiceList) { 
        choices = choiceList;          //save list 
    } 
    //to be implemented in derived classes 
    abstract public JPanel getUI();     //return Panel of components 
    abstract public String[] getSelected(); //get list 
    abstract public void clearAll();        //clear all 
} 