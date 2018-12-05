package DAO;

public class Database {
	String caminho = "jdbc:mysql://Localhost/";
	String user = "root";
	String senha = "";
	
	public Database(String caminho, String user, String senha) {
		super();
		this.caminho = caminho;
		this.user = user;
		this.senha = senha;
	}

	public String getCaminho() {
		return caminho;
	}

	public String getUser() {
		return user;
	}

	public String getSenha() {
		return senha;
	}
	
}
