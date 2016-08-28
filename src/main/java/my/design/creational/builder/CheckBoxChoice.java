package my.design.creational.builder;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class CheckBoxChoice extends MultiChoice{
    //This derived class creates 
    //vertical grid of check boxes 
    int count;                        //number of check boxes 
    JPanel p;    
    public CheckBoxChoice (List<String> choices) { 
        super(choices); 
        count = 0; 
        p = new JPanel(); 
    } 

	@Override
	public void clearAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getSelected() { 
	    String[] slist = null;
	    //TODO: derive the selected items from the panel checkboxes and set here
	    return(slist); 
	} 

	@Override
	 public JPanel getUI() { 
        //create a grid layout 1 column x n rows 
        p.setLayout(new GridLayout (choices.size(), 1)); 
        //and add labeled check boxes to it 
        for (int i = 0; i< choices.size(); i++) { 
            p.add(new JCheckBox(choices.get(i))); 
            count++; 
        } 
        return p; 
    } 
	
}
