package my.patterns.observer;

public class Archiver implements Observer {

	public void update(String operation, String record) {
		System.out.println("Archive observes a operation: "+operation +"on the record: "+record);
	}

}
