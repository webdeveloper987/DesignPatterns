package my.patterns.observer;

public class Test {

	public static void main(String[] args) {
		Database db = new Database();
		db.registerObserver(new Archiver());
		db.registerObserver(new Client());
		
		db.editRecord("delete", "record 1");
	}
}
