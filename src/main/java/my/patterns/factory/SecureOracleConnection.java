package my.patterns.factory;

public class SecureOracleConnection extends Connection {
	public SecureOracleConnection() {
	}

	public String description() {
		return "Oracle secure";
	}
}
