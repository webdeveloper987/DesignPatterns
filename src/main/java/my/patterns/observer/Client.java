package my.patterns.observer;

public class Client implements Observer {
	public void update(String operation, String record) {
		System.out.println("Client observes a operation: "+operation +"on the record: "+record);
	}
}
