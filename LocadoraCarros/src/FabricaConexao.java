
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 
 * @author tiago
 * @version 1.0
 * 
 * Class for JDBC Connection with Database.
 */

public class FabricaConexao {

	public static Connection getConexao(){
		
		try {
			
			Properties prop = getProperties();
			
			String url = prop.getProperty("banco.url");
			String user = prop.getProperty("banco.user");
			String pass = prop.getProperty("banco.pass");
			
			return DriverManager.getConnection(url,user,pass);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException {
		Properties properties = new Properties();
		String caminho = "/connection.properties";
		properties.load(FabricaConexao.class.getResourceAsStream(caminho));
		
		return properties;
	}

}
