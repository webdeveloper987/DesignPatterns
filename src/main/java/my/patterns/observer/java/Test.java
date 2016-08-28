package my.patterns.observer.java;

public class Test {

	public static void main(String[] args) {
		Database db = new Database();
		db.addObserver(new Archiver());
		db.addObserver(new Client());
		
		db.editRecord("Test Operation", "Record 1");

	}

}
