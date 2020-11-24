package superDuperMart;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Venda {

	private JFrame frame;
	private JTable tableCarrinho;
	private JTextField textFieldAddCod;
	private JTextField textFieldAddQntd;
	private JTextField textFieldRMQntd;
	private JTextField textFieldRMCod;
	private JTextField txtFieldTotal;
	private JTextField txtFieldRecebido;
	private JTextField textFieldTroco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venda window = new Venda();
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
	public Venda() {
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
		
		JLabel lblNewLabel_2 = new JLabel("Caixa");
		lblNewLabel_2.setBounds(10, 11, 1160, 44);
		panelDashboard.add(lblNewLabel_2);
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panelVenda = new JPanel();
		panelVenda.setBackground(Color.WHITE);
		panelVenda.setBounds(30, 184, 1159, 555);
		frame.getContentPane().add(panelVenda);
		panelVenda.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 706, 285);
		panelVenda.add(scrollPane);
		
		Object [][] dados = {};
		String [] colunas = {"Codigo de Barras ", "Nome", "Unidade de Medida","Quantidade","Preço","Total"};

		tableCarrinho = new JTable(dados,colunas);
		tableCarrinho.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo de Barras", "Nome", "Unidade", "Pre\u00E7o", "Quantidade", "Total"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableCarrinho.getColumnModel().getColumn(0).setPreferredWidth(105);
		tableCarrinho.getColumnModel().getColumn(1).setPreferredWidth(122);
		tableCarrinho.getColumnModel().getColumn(5).setPreferredWidth(54);
		tableCarrinho.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableCarrinho.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		scrollPane.setViewportView(tableCarrinho);
		
		JLabel lblNewLabel_4 = new JLabel("Codigo de Barras:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(749, 37, 137, 14);
		panelVenda.add(lblNewLabel_4);
		
		textFieldAddCod = new JTextField();
		textFieldAddCod.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldAddCod.setColumns(10);
		textFieldAddCod.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(128, 128, 128)));
		textFieldAddCod.setBackground(Color.WHITE);
		textFieldAddCod.setBounds(749, 62, 172, 20);
		panelVenda.add(textFieldAddCod);
		
		textFieldAddQntd = new JTextField();
		textFieldAddQntd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldAddQntd.setColumns(10);
		textFieldAddQntd.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(128, 128, 128)));
		textFieldAddQntd.setBackground(Color.WHITE);
		textFieldAddQntd.setBounds(954, 62, 172, 20);
		panelVenda.add(textFieldAddQntd);
		
		JLabel lblNewLabel_4_1 = new JLabel("Quantidade:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1.setBounds(954, 37, 137, 14);
		panelVenda.add(lblNewLabel_4_1);
		
		JButton btnAddCarrinho = new JButton("Adicionar ao Carrinho");
		btnAddCarrinho.setBounds(817, 93, 235, 23);
		panelVenda.add(btnAddCarrinho);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRemover.setBounds(817, 254, 235, 23);
		panelVenda.add(btnRemover);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Quantidade:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1_1.setBounds(954, 198, 137, 14);
		panelVenda.add(lblNewLabel_4_1_1);
		
		textFieldRMQntd = new JTextField();
		textFieldRMQntd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldRMQntd.setColumns(10);
		textFieldRMQntd.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(128, 128, 128)));
		textFieldRMQntd.setBackground(Color.WHITE);
		textFieldRMQntd.setBounds(954, 223, 172, 20);
		panelVenda.add(textFieldRMQntd);
		
		textFieldRMCod = new JTextField();
		textFieldRMCod.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldRMCod.setColumns(10);
		textFieldRMCod.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(128, 128, 128)));
		textFieldRMCod.setBackground(Color.WHITE);
		textFieldRMCod.setBounds(749, 223, 172, 20);
		panelVenda.add(textFieldRMCod);
		
		JLabel lblNewLabel_4_2 = new JLabel("Codigo de Barras:");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_2.setBounds(749, 198, 137, 14);
		panelVenda.add(lblNewLabel_4_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 296, 706, 57);
		panelVenda.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBounds(248, 11, 81, 35);
		panel.add(lblNewLabel_3);
		
		JLabel lblPrecoTotal = new JLabel("0,00");
		lblPrecoTotal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPrecoTotal.setBounds(355, 11, 341, 35);
		panel.add(lblPrecoTotal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(20, 364, 1139, 10);
		panelVenda.add(panel_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Pagamento");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(10, 385, 284, 159);
		panelVenda.add(lblNewLabel_3_2);
		
		JComboBox comboBoxOpPgmt = new JComboBox();
		comboBoxOpPgmt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, comboBoxOpPgmt.getSelectedItem().toString());
			}
		});
		comboBoxOpPgmt.setModel(new DefaultComboBoxModel(new String[] {"--", "Dinheiro", "Cart\u00E3o de D\u00E9bito", "Cart\u00E3o de Cr\u00E9dito", "Ticket"}));
		comboBoxOpPgmt.setBounds(304, 459, 172, 22);
		panelVenda.add(comboBoxOpPgmt);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFinalizar.setBounds(868, 459, 172, 23);
		panelVenda.add(btnFinalizar);
		
		txtFieldTotal = new JTextField();
		txtFieldTotal.setText("R$ 0.00");
		txtFieldTotal.setEditable(false);
		txtFieldTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldTotal.setColumns(10);
		txtFieldTotal.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(128, 128, 128)));
		txtFieldTotal.setBackground(Color.WHITE);
		txtFieldTotal.setBounds(577, 410, 172, 20);
		panelVenda.add(txtFieldTotal);
		
		JLabel lblNewLabel_4_3 = new JLabel("Total da Compra");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_3.setBounds(577, 385, 137, 14);
		panelVenda.add(lblNewLabel_4_3);
		
		txtFieldRecebido = new JTextField();
		txtFieldRecebido.setText("R$ 0.00");
		txtFieldRecebido.setEditable(false);
		txtFieldRecebido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldRecebido.setColumns(10);
		txtFieldRecebido.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(128, 128, 128)));
		txtFieldRecebido.setBackground(Color.WHITE);
		txtFieldRecebido.setBounds(577, 466, 172, 20);
		panelVenda.add(txtFieldRecebido);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("Total Recebido");
		lblNewLabel_4_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_3_1.setBounds(577, 441, 137, 14);
		panelVenda.add(lblNewLabel_4_3_1);
		
		JLabel lblNewLabel_4_3_1_1 = new JLabel("Troco");
		lblNewLabel_4_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_3_1_1.setBounds(577, 497, 137, 14);
		panelVenda.add(lblNewLabel_4_3_1_1);
		
		textFieldTroco = new JTextField();
		textFieldTroco.setText("R$ 0.00");
		textFieldTroco.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldTroco.setEditable(false);
		textFieldTroco.setColumns(10);
		textFieldTroco.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(128, 128, 128)));
		textFieldTroco.setBackground(Color.WHITE);
		textFieldTroco.setBounds(577, 522, 172, 20);
		panelVenda.add(textFieldTroco);
		
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
		btnRelatorios.setBounds(351, 11, 98, 23);
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
