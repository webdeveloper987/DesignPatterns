package my.patterns.factory;

public class SecureFactory extends ConnectionFactory
{
public Connection createConnection(String type)
{
if (type.equals("Oracle")){
return new SecureOracleConnection();
}
else {
return new SecureMySqlConnection();
}
}
}
