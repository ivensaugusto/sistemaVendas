package DAO;

public class Database {
	String caminho;
	String user;
	String senha;
	
	public Database(String caminho, String user, String senha) {
		super();
		this.caminho = caminho;
		this.user = user;
		this.senha = senha;
	}

	public Database() {
		super();
		this.caminho = "jdbc:mysql://Localhost/db_sistemavendas";
		this.user = "root";
		this.senha = "";
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
