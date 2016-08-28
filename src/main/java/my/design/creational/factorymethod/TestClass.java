package my.design.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	public static void main(String[] a){
		List<Event> eventsList = new ArrayList<Event>(); 
		eventsList.add(new TimedFinalEvent("500free.txt", 6));
		eventsList.add(new PrelimEvent("100free.txt", 6)); 
	}
}
