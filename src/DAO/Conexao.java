package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection conectar(Database database) throws SQLException {
		String caminho = database.getCaminho();
		String user = database.getUser();
		String senha = database.getSenha();
		Connection conexao = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao =  DriverManager.getConnection(caminho,user,senha);
		}catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
		}
		return conexao;
	}

	public static void desconectar(Database database) throws SQLException {
		String caminho = database.getCaminho();
		String user = database.getUser();
		String senha = database.getSenha();
		try
		{
			DriverManager.getConnection(caminho,user,senha).close();
		}
		catch (SQLException e)
		{
			System.err.println("SYSTEM ERROR: Falha no fechamento da conexão");
			e.printStackTrace();
		}

	}
}
