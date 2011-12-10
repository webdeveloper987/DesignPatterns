package my.patterns.factory;

public class SecureMySqlConnection extends Connection {
	public SecureMySqlConnection() {
	}

	public String description() {
		return "MySQL secure";
	}
}
