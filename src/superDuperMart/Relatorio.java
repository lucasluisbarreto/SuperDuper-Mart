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

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Relatorio {

	private JFrame frame;
	private JTable tableCompras;
	private JTable tableVendas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Relatorio window = new Relatorio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Relatorio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame = new JFrame();
		frame.setTitle("Sistema de Gest\u00E3o Super-Duper Mart");
		frame.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 1200, 750);
		frame.setLocation(dim.width/2 - frame.getSize().width/2,dim.height/2 - frame.getSize().height/2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMaximumSize(new Dimension(1200,750));
		frame.setUndecorated(true);
		frame.setPreferredSize(new Dimension(1200,750));
		frame.getContentPane().setLayout(null);
		
		JPanel panelHeader = new JPanel();
		panelHeader.setBackground(new Color(135, 206, 250));
		panelHeader.setBounds(10, 47, 1180, 76);
		frame.getContentPane().add(panelHeader);
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
		frame.getContentPane().add(panelDashboard);
		panelDashboard.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Relatorios");
		lblNewLabel_2.setBounds(10, 11, 1160, 44);
		panelDashboard.add(lblNewLabel_2);
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panelRelatorios = new JPanel();
		panelRelatorios.setBackground(Color.WHITE);
		panelRelatorios.setBounds(20, 184, 1159, 534);
		frame.getContentPane().add(panelRelatorios);
		panelRelatorios.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 268, 556, 255);
		panelRelatorios.add(scrollPane);
		
		tableCompras = new JTable();
		scrollPane.setViewportView(tableCompras);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(576, 268, 573, 255);
		panelRelatorios.add(scrollPane_1);
		
		tableVendas = new JTable();
		scrollPane_1.setViewportView(tableVendas);
		
		JLabel lblNewLabel_3_2 = new JLabel("Hist\u00F3rico de Compras");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(10, 232, 556, 25);
		panelRelatorios.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Hist\u00F3rico de Vendas");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2_1.setBounds(576, 232, 573, 25);
		panelRelatorios.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Compra de Produtos:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(512, 11, 131, 14);
		panelRelatorios.add(lblNewLabel_4_1);
		
		JLabel lblCompraProdutos = new JLabel("R$ TotalGasto,00");
		lblCompraProdutos.setForeground(Color.RED);
		lblCompraProdutos.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 15));
		lblCompraProdutos.setBounds(512, 26, 183, 37);
		panelRelatorios.add(lblCompraProdutos);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Receita em Vendas:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1.setBounds(512, 78, 131, 14);
		panelRelatorios.add(lblNewLabel_4_1_1);
		
		JLabel lblReceitaVendas = new JLabel("R$ TotalGasto,00");
		lblReceitaVendas.setForeground(new Color(0, 100, 0));
		lblReceitaVendas.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 15));
		lblReceitaVendas.setBounds(512, 93, 183, 37);
		panelRelatorios.add(lblReceitaVendas);
		
		JLabel lblNewLabel_4 = new JLabel("Lucro Total:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(512, 163, 70, 14);
		panelRelatorios.add(lblNewLabel_4);
		
		JLabel lblLucro = new JLabel("R$ LucroTotal,00");
		lblLucro.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 18));
		lblLucro.setBounds(512, 178, 183, 37);
		panelRelatorios.add(lblLucro);
		
		JPanel panelOp = new JPanel();
		panelOp.setBackground(Color.WHITE);
		panelOp.setBounds(10, 0, 1180, 39);
		frame.getContentPane().add(panelOp);
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
