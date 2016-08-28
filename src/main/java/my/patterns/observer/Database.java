package my.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Database implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();

	private String operation;

	private String record;

	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(operation, record);
		}
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		notifyObservers();
	}
}
