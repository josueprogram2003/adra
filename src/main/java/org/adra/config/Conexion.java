package org.adra.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static final String URL="jdbc:mysql://localhost:3306/p_integrador?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USER="root";
	private static final String PASS="root";
	private static final String DRIVER="com.mysql.cj.jdbc.Driver";
	    private static Connection cx = null;

	    public static Connection getConexion() {
	        try {
	            Class.forName(DRIVER);
	            if (cx == null) {
	                cx = DriverManager.getConnection(URL, USER, PASS);
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            // TODO: handle exception
	            System.out.println("Error: " + e);
	        }

	        return cx;
	    }
}
