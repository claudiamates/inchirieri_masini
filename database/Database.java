package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.CallableStatement;

public class Database {

	private static Database databaseConnection;

	private Connection connection = null;
	private Statement statement = null;
	private CallableStatement myStmt = null;

	private Database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/managment_inchirieri_masini", "root", "Rdia#98COK");

			statement = connection.createStatement();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet executeStatement(final String sqlQuery) {
		try {
			return statement.executeQuery(sqlQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Connection getConnection() {
		return connection;
	}

	public static Database getInstance() {
		if (databaseConnection == null) {
			databaseConnection = new Database();
		}
		return databaseConnection;
	}
	
	/*public Databese executeProcedure()
	{
		
	}*/
}