package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static Connection connection;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+System.getenv("GESUSER_DB"),System.getenv("DB_USERNAME"),System.getenv("DB_PASSWORD"));	
			if (connection != null) {
                System.out.println("Connexion à la base de données réussie !");
			}		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur lors de la connexion à la base de données :" + e.getMessage());
			}
	}
	public static Connection getConnection() {
		return connection;
	}
}
