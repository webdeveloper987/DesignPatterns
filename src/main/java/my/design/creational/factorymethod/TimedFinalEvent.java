package my.design.creational.factorymethod;

public class TimedFinalEvent extends Event { 
    //class describes an event that will be swum twice 
 
    public TimedFinalEvent(String filename, int lanes) { 
        super(filename, lanes); 
    } 
 
    //return circle seeding 
    @Override
	public Seeding getSeeding() { 
        return new StraightSeeding(swimmers, numLanes); 
    } 
 
    @Override
	public boolean isPrelim() { 
        return true; 
    } 
 
    @Override
	public boolean isFinal() { 
    	 return false; 
    } 
 
    @Override
	public boolean isTimedFinal(){ 
        return false; 
    } 
} 