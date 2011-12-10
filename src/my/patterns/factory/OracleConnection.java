package my.patterns.factory;

public class OracleConnection extends Connection {
	public OracleConnection() {
	}

	public String description() {
		return "Oracle";
	}
}
