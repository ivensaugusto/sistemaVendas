package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import java.awt.event.MouseMotionAdapter;

public class TelaVendas extends JFrame {

	private JPanel contentPane;
	private JTextField tfPreco;
	private JTextField tfQuantidade;
	private JTextField tfDescricao;
	private JTextField tfCodProduto;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendas frame = new TelaVendas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaVendas() {
		setResizable(false);
		setTitle("Tela de vendas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 433, 21);
		contentPane.add(menuBar);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		menuBar.add(mntmProduto);
		
		JMenuItem mntmVenda = new JMenuItem("Venda");
		menuBar.add(mntmVenda);
		
		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		menuBar.add(mntmFornecedor);
		
		JMenuItem mntmEstoque = new JMenuItem("Estoque");
		menuBar.add(mntmEstoque);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table_1 = new JTable();	
				System.out.println("cona");
			}
		});
		btnPesquisar.setBounds(10, 240, 95, 23);
		contentPane.add(btnPesquisar);
		
		JButton button = new JButton("Pesquisar");
		button.setBounds(10, 240, 95, 23);
		contentPane.add(button);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(115, 240, 95, 23);
		contentPane.add(btnAlterar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setBounds(220, 240, 95, 23);
		contentPane.add(btnApagar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(325, 240, 95, 23);
		contentPane.add(btnCadastrar);
		
		JPanel pnlProduto = new JPanel();
		pnlProduto.setBounds(10, 32, 413, 197);
		contentPane.add(pnlProduto);
		pnlProduto.setLayout(null);
		
		JLabel lblCodProduto = new JLabel("C\u00F3digo do produto");
		lblCodProduto.setBounds(20, 8, 89, 14);
		pnlProduto.add(lblCodProduto);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setHorizontalAlignment(SwingConstants.LEFT);
		tfQuantidade.setBounds(129, 60, 86, 20);
		tfQuantidade.setColumns(10);
		pnlProduto.add(tfQuantidade);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o do produto");
		lblDescricao.setBounds(20, 38, 102, 14);
		pnlProduto.add(lblDescricao);
		
		tfCodProduto = new JTextField();
		tfCodProduto.setHorizontalAlignment(SwingConstants.LEFT);
		tfCodProduto.setBounds(129, 5, 86, 20);
		tfCodProduto.setColumns(10);
		pnlProduto.add(tfCodProduto);
		
		tfDescricao = new JTextField();
		tfDescricao.setHorizontalAlignment(SwingConstants.LEFT);
		tfDescricao.setBounds(129, 35, 235, 20);
		tfDescricao.setColumns(10);
		pnlProduto.add(tfDescricao);
		
		tfPreco = new JTextField();
		tfPreco.setBounds(278, 60, 86, 20);
		tfPreco.setColumns(10);
		pnlProduto.add(tfPreco);
		
		JLabel lclPreco = new JLabel("Pre\u00E7o");
		lclPreco.setBounds(240, 63, 27, 14);
		pnlProduto.add(lclPreco);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(20, 63, 56, 14);
		pnlProduto.add(lblQuantidade);
	
		
		table_1 = new JTable();
		table_1.setBounds(30, 110, 1, 1);
		pnlProduto.add(table_1);
	}
}
