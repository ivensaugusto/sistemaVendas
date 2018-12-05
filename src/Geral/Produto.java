package Geral;
import java.util.Collection;

public class Produto {

	private int codProduto;

	private char nome;

	private char descricao;

	private double precoCompra;

	private Collection<ItemCompra> itemCompra;

	private Estoque estoque;

	private Encargos encargos;

	private ItemVenda itemVenda;

	private Collection<ItemVenda> itemVendas;

	public double consultarPreco(int codProduto) {
		return 0;
	}

}
