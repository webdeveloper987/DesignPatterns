package my.design.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class StraightSeeding extends Seeding { 
    protected List<Swimmer>    swimmers; 
    protected Swimmer[] swmrs; 
    protected int       numLanes; 
    protected int[]     lanes; 
    protected int       count; 
    protected int       numHeats; 

	public StraightSeeding(List<Swimmer> sw, int lanes) { 
		swimmers = sw; 
	    numLanes = lanes; 
	    count = sw.size(); 
	    calcLaneOrder(); 
	    seed(); 
	  } 
	
	private void calcLaneOrder() {
		// TODO Auto-generated method stub
		
	}

	protected void seed() { 
	    //loads the swmrs array and sorts it 
	    sortUpwards(); 
	
	    int lastHeat = count % numLanes; 
	    if(lastHeat < 3) 
	       lastHeat = 3;     //last heat must have 3 or more 
	    int lastLanes = count - lastHeat; 
	    numHeats = count / numLanes; 
	    if(lastLanes > 0) 
	       numHeats++; 
	    int heats = numHeats; 
	
	    //place heat and lane in each swimmer's object 
	    int j = 0; 
	
	    for(int i = 0; i < lastLanes; i++) { 
	       Swimmer sw = swmrs[i]; 
	
	       sw.setLane(lanes[j++]); 
	       sw.setHeat(heats); 
	       if(j >= numLanes) { 
	          heats--; 
	          j=0; 
	       } 
	    } 
	    //Add in last partial heat 
	    if(j < numLanes) 
	       heats--; 
	    j = 0; 
	    for(int i = lastLanes-1; i<count; i++) { 
	       Swimmer sw = swmrs[i]; 
	       sw.setLane(lanes[j++]); 
	    } 
	    //copy from array back into Vector 
	
	    swimmers = new ArrayList<Swimmer>(); 
	    for(int i = 0; i < count; i++) 
	    	swimmers.add(swmrs[i]); 
	}

	private void sortUpwards() {
		// TODO Auto-generated method stub
		
	} 
}
