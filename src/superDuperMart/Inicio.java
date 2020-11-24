package superDuperMart;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import javax.swing.JFrame;

public class Inicio {

	private JFrame frmSistemaDeGesto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frmSistemaDeGesto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frmSistemaDeGesto = new JFrame();
		frmSistemaDeGesto.setTitle("Sistema de Gest\u00E3o Super-Duper Mart");
		frmSistemaDeGesto.setBackground(Color.LIGHT_GRAY);
		frmSistemaDeGesto.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmSistemaDeGesto.setBounds(100, 100, 1200, 750);
		frmSistemaDeGesto.setLocation(dim.width/2 - frmSistemaDeGesto.getSize().width/2,dim.height/2 - frmSistemaDeGesto.getSize().height/2);
		frmSistemaDeGesto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSistemaDeGesto.setMaximumSize(new Dimension(1200,750));
		frmSistemaDeGesto.setUndecorated(true);
		frmSistemaDeGesto.setPreferredSize(new Dimension(1200,750));
		frmSistemaDeGesto.getContentPane().setLayout(null);
		
		JPanel panelHeader = new JPanel();
		panelHeader.setBackground(new Color(135, 206, 250));
		panelHeader.setBounds(10, 47, 1180, 76);
		frmSistemaDeGesto.getContentPane().add(panelHeader);
		panelHeader.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem vindo ao");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblNewLabel.setBounds(334, 0, 168, 75);
		panelHeader.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sistema de Gest\u00E3o Super-Duper Mart");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_1.setBounds(500, 0, 476, 75);
		panelHeader.add(lblNewLabel_1);
		
		JPanel panelDashboard = new JPanel();
		panelDashboard.setBackground(Color.WHITE);
		panelDashboard.setBounds(20, 134, 1159, 39);
		frmSistemaDeGesto.getContentPane().add(panelDashboard);
		panelDashboard.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Dashboard");
		lblNewLabel_2.setBounds(10, 11, 1160, 44);
		panelDashboard.add(lblNewLabel_2);
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panelFinanceiro = new JPanel();
		panelFinanceiro.setBackground(Color.WHITE);
		panelFinanceiro.setBounds(20, 184, 1159, 270);
		frmSistemaDeGesto.getContentPane().add(panelFinanceiro);
		panelFinanceiro.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Financeiro");
		lblNewLabel_3.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 11, 87, 248);
		panelFinanceiro.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(94, 11, 5, 248);
		panelFinanceiro.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		panel_1.setBounds(194, 15, 284, 248);
		panelFinanceiro.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLucro = new JLabel("R$ LucroTotal,00");
		lblLucro.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 18));
		lblLucro.setBounds(41, 200, 183, 37);
		panel_1.add(lblLucro);
		
		JLabel lblNewLabel_4 = new JLabel("Lucro Total:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(41, 185, 70, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Compra de Produtos:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(41, 33, 131, 14);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblCompraProdutos = new JLabel("R$ TotalGasto,00");
		lblCompraProdutos.setForeground(new Color(255, 0, 0));
		lblCompraProdutos.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 15));
		lblCompraProdutos.setBounds(41, 48, 183, 37);
		panel_1.add(lblCompraProdutos);
		
		JLabel lblReceitaVendas = new JLabel("R$ TotalGasto,00");
		lblReceitaVendas.setForeground(new Color(0, 100, 0));
		lblReceitaVendas.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 15));
		lblReceitaVendas.setBounds(41, 115, 183, 37);
		panel_1.add(lblReceitaVendas);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Receita em Vendas:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1.setBounds(41, 100, 131, 14);
		panel_1.add(lblNewLabel_4_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(190, 11, 292, 255);
		panelFinanceiro.add(panel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(877, 16, 201, 113);
		panelFinanceiro.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnIrCaixa = new JButton("Ir para Caixa");
		btnIrCaixa.setBounds(10, 79, 181, 23);
		panel_1_1.add(btnIrCaixa);
		
		JLabel lblNewLabel_5 = new JLabel("Nova Venda");
		lblNewLabel_5.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 11, 181, 91);
		panel_1_1.add(lblNewLabel_5);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1.setBounds(873, 12, 210, 120);
		panelFinanceiro.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBounds(877, 146, 201, 112);
		panelFinanceiro.add(panel_1_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Gerar Relatorio Financeiro");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(10, 11, 181, 91);
		panel_1_1_1.add(lblNewLabel_5_1);
		
		JButton btnIrRelatorios = new JButton("Ir para Relatorio");
		btnIrRelatorios.setBounds(10, 79, 181, 23);
		panel_1_1_1.add(btnIrRelatorios);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1_1.setBounds(873, 140, 210, 121);
		panelFinanceiro.add(panel_2_1_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		panel_1_1_2.setBackground(Color.WHITE);
		panel_1_1_2.setBounds(555, 25, 201, 113);
		panelFinanceiro.add(panel_1_1_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Valor Total em Produtos:");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_2.setBounds(10, 34, 156, 14);
		panel_1_1_2.add(lblNewLabel_4_2);
		
		JLabel lblValorProdutos = new JLabel("R$ TotalProdutos,00");
		lblValorProdutos.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 18));
		lblValorProdutos.setBounds(10, 49, 183, 37);
		panel_1_1_2.add(lblValorProdutos);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBackground(Color.LIGHT_GRAY);
		panel_2_1_2.setBounds(551, 21, 210, 120);
		panelFinanceiro.add(panel_2_1_2);
		
		JPanel panelEstoque = new JPanel();
		panelEstoque.setBackground(Color.WHITE);
		panelEstoque.setBounds(20, 465, 1159, 270);
		frmSistemaDeGesto.getContentPane().add(panelEstoque);
		panelEstoque.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(94, 11, 5, 248);
		panelEstoque.add(panel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Estoque");
		lblNewLabel_3_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 15));
		lblNewLabel_3_1.setAlignmentX(0.5f);
		lblNewLabel_3_1.setBounds(10, 11, 87, 248);
		panelEstoque.add(lblNewLabel_3_1);
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setLayout(null);
		panel_1_1_3.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		panel_1_1_3.setBackground(Color.WHITE);
		panel_1_1_3.setBounds(879, 15, 201, 113);
		panelEstoque.add(panel_1_1_3);
		
		JButton btnIrCompraEstoque = new JButton("Ir para Compra de Estoque");
		btnIrCompraEstoque.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnIrCompraEstoque.setBounds(10, 79, 181, 23);
		panel_1_1_3.add(btnIrCompraEstoque);
		
		JLabel lblNewLabel_5_2 = new JLabel("Nova Compra de Estoque");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 15));
		lblNewLabel_5_2.setBounds(10, 11, 181, 91);
		panel_1_1_3.add(lblNewLabel_5_2);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setLayout(null);
		panel_2_1_3.setBackground(Color.LIGHT_GRAY);
		panel_2_1_3.setBounds(875, 11, 210, 120);
		panelEstoque.add(panel_2_1_3);
		
		JPanel panel_1_1_4 = new JPanel();
		panel_1_1_4.setLayout(null);
		panel_1_1_4.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		panel_1_1_4.setBackground(Color.WHITE);
		panel_1_1_4.setBounds(879, 143, 201, 113);
		panelEstoque.add(panel_1_1_4);
		
		JButton btnGerarEtiquetas = new JButton("Ir para Produtos");
		btnGerarEtiquetas.setBounds(10, 79, 181, 23);
		panel_1_1_4.add(btnGerarEtiquetas);
		
		JLabel lblProdutos = new JLabel("Gerenciar Produtos");
		lblProdutos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProdutos.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 15));
		lblProdutos.setBounds(10, 11, 181, 91);
		panel_1_1_4.add(lblProdutos);
		
		JPanel panel_2_1_4 = new JPanel();
		panel_2_1_4.setLayout(null);
		panel_2_1_4.setBackground(Color.LIGHT_GRAY);
		panel_2_1_4.setBounds(875, 139, 210, 120);
		panelEstoque.add(panel_2_1_4);
		
		JPanel panel_1_1_3_1 = new JPanel();
		panel_1_1_3_1.setLayout(null);
		panel_1_1_3_1.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		panel_1_1_3_1.setBackground(Color.WHITE);
		panel_1_1_3_1.setBounds(183, 15, 201, 113);
		panelEstoque.add(panel_1_1_3_1);
		
		JLabel lblNewLabel_4_3 = new JLabel("Numero Total de Produtos:");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_3.setBounds(10, 30, 158, 14);
		panel_1_1_3_1.add(lblNewLabel_4_3);
		
		JLabel lblTotalProdutos = new JLabel("0 Produtos Disponiveis");
		lblTotalProdutos.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 16));
		lblTotalProdutos.setBounds(10, 52, 183, 37);
		panel_1_1_3_1.add(lblTotalProdutos);
		
		JPanel panel_2_1_3_1 = new JPanel();
		panel_2_1_3_1.setLayout(null);
		panel_2_1_3_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1_3_1.setBounds(179, 11, 210, 120);
		panelEstoque.add(panel_2_1_3_1);
		
		JPanel panel_1_1_3_1_1 = new JPanel();
		panel_1_1_3_1_1.setLayout(null);
		panel_1_1_3_1_1.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		panel_1_1_3_1_1.setBackground(Color.WHITE);
		panel_1_1_3_1_1.setBounds(183, 143, 201, 113);
		panelEstoque.add(panel_1_1_3_1_1);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("Quantidade de Itens no Estoque:");
		lblNewLabel_4_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_3_1.setBounds(10, 30, 191, 14);
		panel_1_1_3_1_1.add(lblNewLabel_4_3_1);
		
		JLabel lblItensNoEstoque = new JLabel("0 Itens no Estoque");
		lblItensNoEstoque.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 16));
		lblItensNoEstoque.setBounds(10, 52, 183, 37);
		panel_1_1_3_1_1.add(lblItensNoEstoque);
		
		JPanel panel_2_1_3_1_1 = new JPanel();
		panel_2_1_3_1_1.setLayout(null);
		panel_2_1_3_1_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1_3_1_1.setBounds(179, 139, 210, 120);
		panelEstoque.add(panel_2_1_3_1_1);
		
		JPanel panel_1_1_3_1_2 = new JPanel();
		panel_1_1_3_1_2.setLayout(null);
		panel_1_1_3_1_2.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		panel_1_1_3_1_2.setBackground(Color.WHITE);
		panel_1_1_3_1_2.setBounds(521, 12, 201, 113);
		panelEstoque.add(panel_1_1_3_1_2);
		
		JLabel lblNewLabel_4_3_2 = new JLabel("Numero de Produtos Indisponiveis:");
		lblNewLabel_4_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_3_2.setBounds(10, 29, 191, 14);
		panel_1_1_3_1_2.add(lblNewLabel_4_3_2);
		
		JLabel lblProdutosIndisponiveis = new JLabel("0 Produtos Indisponiveis");
		lblProdutosIndisponiveis.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 16));
		lblProdutosIndisponiveis.setBounds(10, 52, 183, 37);
		panel_1_1_3_1_2.add(lblProdutosIndisponiveis);
		
		JPanel panel_2_1_3_1_2 = new JPanel();
		panel_2_1_3_1_2.setLayout(null);
		panel_2_1_3_1_2.setBackground(Color.LIGHT_GRAY);
		panel_2_1_3_1_2.setBounds(517, 8, 210, 120);
		panelEstoque.add(panel_2_1_3_1_2);
		
		JPanel panel_1_1_3_1_2_1 = new JPanel();
		panel_1_1_3_1_2_1.setLayout(null);
		panel_1_1_3_1_2_1.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		panel_1_1_3_1_2_1.setBackground(Color.WHITE);
		panel_1_1_3_1_2_1.setBounds(521, 143, 201, 113);
		panelEstoque.add(panel_1_1_3_1_2_1);
		
		JLabel lblNewLabel_4_3_2_1 = new JLabel("Produtos em Quantidade Cr\u00EDtica:");
		lblNewLabel_4_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_3_2_1.setBounds(10, 30, 183, 14);
		panel_1_1_3_1_2_1.add(lblNewLabel_4_3_2_1);
		
		JLabel lblTotalProdutos_1 = new JLabel("0 Produtos Acabando");
		lblTotalProdutos_1.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 16));
		lblTotalProdutos_1.setBounds(10, 52, 183, 37);
		panel_1_1_3_1_2_1.add(lblTotalProdutos_1);
		
		JPanel panel_2_1_3_1_2_1 = new JPanel();
		panel_2_1_3_1_2_1.setLayout(null);
		panel_2_1_3_1_2_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1_3_1_2_1.setBounds(517, 139, 210, 120);
		panelEstoque.add(panel_2_1_3_1_2_1);
		
		JPanel panelOp = new JPanel();
		panelOp.setBackground(Color.WHITE);
		panelOp.setBounds(10, 0, 1180, 39);
		frmSistemaDeGesto.getContentPane().add(panelOp);
		panelOp.setLayout(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(1081, 11, 89, 23);
		panelOp.add(btnSair);
		
		JButton btnDashboard = new JButton("DashBoard");
		btnDashboard.setBounds(31, 11, 89, 23);
		panelOp.add(btnDashboard);
		
		JButton btnCaixa = new JButton("Caixa");
		btnCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCaixa.setBounds(140, 11, 89, 23);
		panelOp.add(btnCaixa);
		
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.setBounds(252, 11, 89, 23);
		panelOp.add(btnEstoque);
		
		JButton btnRelatorios = new JButton("Relatorio");
		btnRelatorios.setBounds(351, 11, 89, 23);
		panelOp.add(btnRelatorios);
		
		JButton btnRefresh = new JButton("Atualizar");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnRefresh.setBounds(955, 11, 89, 23);
		panelOp.add(btnRefresh);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}



}
