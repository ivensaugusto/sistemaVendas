
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDAO {
///////  este metodo é apenas um teste ///////////////
	public ResultSet listar(String tfCodProduto) throws SQLException {
		Database database = new Database();
		Connection conexao = Conexao.conectar(database);
		String sql = "Select * From Produto Where codProduto = ?;";
		if (tfCodProduto.equals(null) || tfCodProduto.equals("")) {
			sql = "Select * From Produto;";
		}
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, tfCodProduto);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			tfCodProduto =  rs.getString(1);
		}else {
			tfCodProduto = "blablabla";
		}
		stmt.close();
		conexao.close();
		
		return rs;
	}
}