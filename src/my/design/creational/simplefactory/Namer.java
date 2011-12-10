package my.design.creational.simplefactory;

public class Namer {
	  //base class extended by two child classes 
    protected String last;     //split name 
    protected String first;    //stored here 
 
    public String getFirst() { 
        return first;          //return first name 
    } 
    public String getLast() { 
        return last;           //return last name 
    }
}
