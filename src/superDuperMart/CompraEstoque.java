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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class CompraEstoque {

	private JFrame frame;
	private JTextField textFieldPesquisar;
	private JTable table;
	private JTable tablePesquisaProduto;
	private JTextField textFieldNome;
	private JTextField textFieldPreco;
	private JTextField textFieldUnidadeMedida;
	private JTextField textFieldQuantidade;
	private JTable tableCarrinho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompraEstoque window = new CompraEstoque();
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
	public CompraEstoque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(220, 220, 220));
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
		panelHeader.setBorder(new LineBorder(new Color(0, 0, 0)));
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
		panelDashboard.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDashboard.setBackground(new Color(135, 206, 250));
		panelDashboard.setBounds(20, 134, 1159, 39);
		frame.getContentPane().add(panelDashboard);
		panelDashboard.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Compra de Estoque");
		lblNewLabel_2.setBounds(10, 11, 1160, 44);
		panelDashboard.add(lblNewLabel_2);
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panelComprar = new JPanel();
		panelComprar.setBackground(Color.WHITE);
		panelComprar.setBounds(20, 184, 1159, 555);
		frame.getContentPane().add(panelComprar);
		panelComprar.setLayout(null);
		
		JButton btnFinalizarCompra = new JButton("Finalizar Compra");
		btnFinalizarCompra.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnFinalizarCompra.setBounds(468, 521, 162, 23);
		panelComprar.add(btnFinalizarCompra);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 11, 1139, 485);
		panelComprar.add(panel);
		
		Object [][] dados = {};
		String [] colunas = {"Codigo de Barras ", "Nome", "Descrição", "Preço" , "Quantidade","Unidade de Medida"};
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 42, 1095, 109);
		panel.add(scrollPane);
		
		tablePesquisaProduto = new JTable(dados,colunas);
		tablePesquisaProduto.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo de Barras ", "Nome", "Descri\u00E7\u00E3o", "Pre\u00E7o", "Quantidade", "Unidade de Medida"
			}
		));
		tablePesquisaProduto.getColumnModel().getColumn(0).setPreferredWidth(97);
		tablePesquisaProduto.getColumnModel().getColumn(2).setPreferredWidth(165);
		tablePesquisaProduto.getColumnModel().getColumn(3).setPreferredWidth(44);
		tablePesquisaProduto.getColumnModel().getColumn(4).setPreferredWidth(70);
		tablePesquisaProduto.getColumnModel().getColumn(5).setPreferredWidth(174);
		tablePesquisaProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
				JTable source = (JTable)e.getSource();
		        int row = source.rowAtPoint( e.getPoint() );
		        int column = source.columnAtPoint( e.getPoint() );
//		        String s=source.getModel().getValueAt(row, column)+"";
		        String s = source.getModel().getValueAt(row, 0)+" "+source.getModel().getValueAt(row, 1)+" "+source.getModel().getValueAt(row, 2)+" ";
		        JOptionPane.showMessageDialog(null, s);
			}
		});
		tablePesquisaProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablePesquisaProduto.setAutoscrolls(false);
		tablePesquisaProduto.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tablePesquisaProduto.setDefaultEditor(Object.class, null);
		scrollPane.setViewportView(tablePesquisaProduto);
		
		textFieldPesquisar = new JTextField();
		textFieldPesquisar.setBounds(145, 11, 970, 20);
		panel.add(textFieldPesquisar);
		textFieldPesquisar.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Pesquisar Produto:");
		lblNewLabel_3.setBounds(10, 12, 125, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_4 = new JLabel("Nome:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 162, 46, 14);
		panel.add(lblNewLabel_4);
		
		textFieldNome = new JTextField();
		textFieldNome.setBackground(new Color(255, 255, 255));
		textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldNome.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(128, 128, 128)));
		textFieldNome.setBounds(20, 187, 342, 20);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Descri\u00E7\u00E3o:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1.setBounds(481, 162, 80, 14);
		panel.add(lblNewLabel_4_1);
		
		JTextArea textDescricao = new JTextArea();
		textDescricao.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		textDescricao.setBounds(481, 189, 495, 77);
		panel.add(textDescricao);
		
		JLabel lblNewLabel_4_2 = new JLabel("Pre\u00E7o:");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_2.setBounds(372, 164, 46, 14);
		panel.add(lblNewLabel_4_2);
		
		textFieldPreco = new JTextField();
		textFieldPreco.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldPreco.setColumns(10);
		textFieldPreco.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(128, 128, 128)));
		textFieldPreco.setBounds(372, 187, 99, 20);
		panel.add(textFieldPreco);
		
		JLabel lblNewLabel_4_4 = new JLabel("Unidade de Medida:");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_4.setBounds(20, 220, 125, 14);
		panel.add(lblNewLabel_4_4);
		
		textFieldUnidadeMedida = new JTextField();
		textFieldUnidadeMedida.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldUnidadeMedida.setColumns(10);
		textFieldUnidadeMedida.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(128, 128, 128)));
		textFieldUnidadeMedida.setBounds(20, 245, 342, 20);
		panel.add(textFieldUnidadeMedida);
		
		JLabel lblNewLabel_4_5 = new JLabel("Quantidade:");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_5.setBounds(372, 220, 80, 14);
		panel.add(lblNewLabel_4_5);
		
		textFieldQuantidade = new JTextField();
		textFieldQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldQuantidade.setColumns(10);
		textFieldQuantidade.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(128, 128, 128)));
		textFieldQuantidade.setBounds(372, 245, 99, 20);
		panel.add(textFieldQuantidade);
		
		JButton btnAddCarrinho = new JButton("Adicionar Carrinho");
		btnAddCarrinho.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAddCarrinho.setBounds(986, 189, 129, 76);
		panel.add(btnAddCarrinho);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 307, 1095, 144);
		panel.add(scrollPane_1);
		
		tableCarrinho = new JTable(dados,colunas);
		scrollPane_1.setViewportView(tableCarrinho);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(10, 277, 1119, 10);
		panel.add(panel_1);
		
		
		
		JPanel panelOp = new JPanel();
		panelOp.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panelOp.setBackground(Color.WHITE);
		panelOp.setBounds(10, 0, 1180, 39);
		frame.getContentPane().add(panelOp);
		panelOp.setLayout(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(1081, 11, 89, 23);
		panelOp.add(btnSair);
		
		JButton btnDashboard = new JButton("DashBoard");
		btnDashboard.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnDashboard.setActionCommand("Dashboard");
		btnDashboard.setBounds(31, 11, 99, 23);
		panelOp.add(btnDashboard);
		
		JButton btnCaixa = new JButton("Caixa");
		btnCaixa.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCaixa.setBounds(140, 11, 102, 23);
		panelOp.add(btnCaixa);
		
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnEstoque.setBounds(252, 11, 100, 23);
		panelOp.add(btnEstoque);
		
		JButton btnRelatorios = new JButton("Relatorio");
		btnRelatorios.setBounds(362, 11, 99, 23);
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
