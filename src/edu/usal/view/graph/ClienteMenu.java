package edu.usal.view.graph;

import edu.usal.controler.graph.MenuClienteController;
import edu.usal.eventos.graph.MenuClienteEventos;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ClienteMenu extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	MenuClienteController mcc;
	private ListSelectionModel listSelectionModel;


	public ClienteMenu(MenuClienteController mcc) {
		this.mcc = mcc;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JButton btnAltaCliente = new JButton("Alta Cliente");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnAltaCliente).addGap(337)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
						gl_contentPane.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnAltaCliente,
								GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)));

		table = new JTable();
		table.setFillsViewportHeight(true);
		table.getTableHeader().setReorderingAllowed(false);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setForeground(Color.GRAY);
		table.setModel(new DefaultTableModel(new Object[][]{},
				new String[]{"Id_Cliente", "Nombre", "Apellido", "Fecha_Nacimiento", "DNI", "CUIT", "Email", "Calle",
						"Altura", "CP", "Ciudad", "Pais", "Provincia", "N�Pasaporte", "Autoridad_Emision",
						"Fecha_Emision", "Fecha_Vencimiento", "Origen", "N�Personal", "N�Celular", "N�Laboral",
						"Alianza", "Categoria", "Aerolinea"}));
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(50);
		table.getColumnModel().getColumn(6).setPreferredWidth(40);
		table.getColumnModel().getColumn(7).setPreferredWidth(50);
		table.getColumnModel().getColumn(8).setPreferredWidth(50);
		table.getColumnModel().getColumn(9).setPreferredWidth(50);
		scrollPane.setViewportView(table);
		table = mcc.CargarTable(table);
		listSelectionModel = table.getSelectionModel();
		listSelectionModel.addListSelectionListener(new MenuClienteEventos(this));
		setVisible(true);
		contentPane.setLayout(gl_contentPane);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public ListSelectionModel getListSelectionModel() {
		return listSelectionModel;
	}

	public void setListSelectionModel(ListSelectionModel listSelectionModel) {
		this.listSelectionModel = listSelectionModel;
	}

	public MenuClienteController getMcc() {
		return mcc;
	}

}
