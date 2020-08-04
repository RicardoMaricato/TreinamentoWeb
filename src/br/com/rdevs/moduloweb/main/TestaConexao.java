package br.com.rdevs.moduloweb.main;

import java.sql.Connection;

import br.com.rd.rdevs.moduloweb.dao.MysqlConnectionDAO;

public class TestaConexao {
	public static void main(String[] args) {
		
		Connection conn;
		
		try {
			conn = MysqlConnectionDAO.getConnection();
			if (conn != null) {
				System.out.println("Conectado ao Banco de Dados com Sucesso!");
			}	
		} catch (Exception e) {
				System.out.println("Erro na conexão: " + e.getMessage());
			}
	}
}

