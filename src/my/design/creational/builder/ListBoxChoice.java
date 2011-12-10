package my.design.creational.builder;

import java.util.List;

import javax.swing.JList;
import javax.swing.JPanel;

public class ListBoxChoice extends MultiChoice{

	public ListBoxChoice(List<String> choiceList) {
		super(choiceList);
		// TODO Auto-generated constructor stub
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
        //create a panel containing a list box 
        JPanel p = new JPanel(); 
        JList list = new JList(); 
        p.add(list); 
        for (int i = 0; i < choices.size(); i++) 
            list.add(choices.get(i),null); 
        return p; 
    } 
	
}
