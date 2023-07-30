

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LocadoraSystem {

	public static void main(String[] args) throws SQLException {

		Connection connection = FabricaConexao.getConexao();
		Statement stmt = connection.createStatement();
		String sql = "CREATE DATABASE IF NOT EXISTS locadoraCarro";

		stmt.execute(sql);

		connection.close();

	}

}
