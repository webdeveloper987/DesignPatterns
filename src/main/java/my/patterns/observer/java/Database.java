package my.patterns.observer.java;

import java.util.Observable;

public class Database extends Observable {
	private String operation;
	private String record;

	public Database() {
	}

	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		setChanged();
		notifyObservers();
	}

	public String getRecord() {
		return record;
	}

	public String getOperation() {
		return operation;
	}
}
