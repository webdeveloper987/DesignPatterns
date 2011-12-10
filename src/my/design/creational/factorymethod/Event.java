package my.design.creational.factorymethod;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public abstract class Event { 
    protected int    numLanes;        //number of lanes 
    protected List<Swimmer> swimmers;        //list of swimmers 
 
    public Event(String filename, int lanes) { 
        try{
	    	numLanes = lanes; 
	        swimmers = new ArrayList<Swimmer>();
	        //read in swimmers from file
	        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
	        String strLine;
	        while ((strLine = br.readLine()) != null)   { 
	            swimmers.add(new Swimmer(strLine)); 
	        }
	        br.close();
        }catch(Exception e){
        	e.printStackTrace();
        }
    } 
    public abstract Seeding getSeeding(); 
    public abstract boolean isPrelim(); 
    public abstract boolean isFinal(); 
    public abstract boolean isTimedFinal(); 
} 