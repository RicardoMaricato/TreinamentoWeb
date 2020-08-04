package br.com.rd.rdevs.moduloweb.dao;

import java.sql.DriverManager;
import java.sql.Connection;

public class MysqlConnectionDAO {
	
    private static Connection conn;
    
    public static Connection getConnection() throws Exception {
    	
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://dev.crurmnllvgn6.us-east-2.rds.amazonaws.com/avaliacao";
            String login = "java";
            String senha = "1234";
            conn = DriverManager.getConnection(url, login, senha);
            return conn;        
            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }    

    }    
    
}
