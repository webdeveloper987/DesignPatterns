package my.design.creational.builder;

import java.util.List;


public class ChoiceFactory { 
    MultiChoice ui; 
    //class returns a Panel containing 
    //a set of choices displayed by one of 
    //several UI methods 
    public MultiChoice getChoiceUI(List<String> choices) { 
        if (choices.size() <=3) 
            //return a panel of check boxes 
            ui = new CheckBoxChoice(choices); 
        else 
            //return a multiselect list box panel 
            ui = new ListBoxChoice(choices); 
        return ui; 
    } 
} 
