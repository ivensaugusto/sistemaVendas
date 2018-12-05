package Geral;
import java.util.Collection;

public class ItemVenda {

	private int codNotaVenda;

	private int codProduto;

	private int quantidade;

	private Produto produto;

	private Encargos encargos;

	private NotaVenda notaVenda;

	private Collection<NotaVenda> notaVendas;

	public double calcularPrecoItem(Produto produto) {
		return 0;
	}

	public int consultarEstoque(Produto produto) {
		return 0;
	}

	public boolean diminuirEstoque(Produto produto, int quantidade) {
		return false;
	}

}
