package my.patterns.observer.java;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {

	public void update(Observable o, Object record) {
		System.out.println("Client observes a operation: "+((Database)o).getOperation() +"on the record: "+((Database)o).getRecord());
	}

}
