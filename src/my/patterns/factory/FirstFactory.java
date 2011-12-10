package my.patterns.factory;

public class FirstFactory {
	protected String type;

	public FirstFactory(String t) {
		type = t;
	}

	public Connection createConnection() {
		if (type.equals("Oracle")) {
			return new OracleConnection();
		}

		else {
			return new MySqlConnection();
		}
	}
}
