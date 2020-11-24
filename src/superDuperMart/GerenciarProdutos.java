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
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;

import javax.swing.JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class GerenciarProdutos {

	private JFrame frame;
	private JTable tableProdutos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciarProdutos window = new GerenciarProdutos();
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
	public GerenciarProdutos() {
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
		
		JLabel lblNewLabel_2 = new JLabel("Produtos");
		lblNewLabel_2.setBounds(10, 11, 1160, 44);
		panelDashboard.add(lblNewLabel_2);
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panelProdutos = new JPanel();
		panelProdutos.setBackground(Color.WHITE);
		panelProdutos.setBounds(20, 184, 1159, 555);
		frame.getContentPane().add(panelProdutos);
		panelProdutos.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 24, 1139, 520);
		panelProdutos.add(scrollPane);
		
		Object [][] dados = {};
		String [] colunas = {"Codigo de Barras ", "Nome", "Descrição", "Preço" , "Quantidade","Unidade de Medida"};
		tableProdutos = new JTable(dados,colunas);
		tableProdutos.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Codigo de Barras ", "Nome", "Descri\u00E7\u00E3o", "Pre\u00E7o", "Quantidade", "Unidade de Medida"
				}
			));
		
		tableProdutos.addMouseListener(new MouseAdapter() {
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
		tableProdutos.getColumnModel().getColumn(0).setPreferredWidth(97);
		tableProdutos.getColumnModel().getColumn(2).setPreferredWidth(165);
		tableProdutos.getColumnModel().getColumn(3).setPreferredWidth(44);
		tableProdutos.getColumnModel().getColumn(4).setPreferredWidth(70);
		tableProdutos.getColumnModel().getColumn(5).setPreferredWidth(174);
		tableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableProdutos.setAutoscrolls(false);
		tableProdutos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tableProdutos.setDefaultEditor(Object.class, null);
		scrollPane.setViewportView(tableProdutos);
		
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
