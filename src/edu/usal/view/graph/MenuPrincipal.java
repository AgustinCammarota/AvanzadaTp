package edu.usal.view.graph;

import edu.usal.controler.graph.MenuPrincipalController;
import edu.usal.eventos.graph.PrincipalEventos;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	MenuPrincipalController mpc;
	private JButton btnMenuCliente;
	private JButton btnMenuVuelo;
	private JButton btnMenuVenta;
	private JButton btnMenuLineasAereas;

	public MenuPrincipal(MenuPrincipalController mpc) {
		this.mpc = mpc;
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		btnMenuCliente = new JButton("Menu Cliente");
		btnMenuCliente.addActionListener(new PrincipalEventos(this));
		contentPane.add(btnMenuCliente, BorderLayout.NORTH);

		btnMenuVuelo = new JButton("Menu Vuelo");
		contentPane.add(btnMenuVuelo, BorderLayout.WEST);

		btnMenuLineasAereas = new JButton("Menu Linea Aerea");
		contentPane.add(btnMenuLineasAereas, BorderLayout.SOUTH);

		btnMenuVenta = new JButton("Menu Venta");
		contentPane.add(btnMenuVenta, BorderLayout.EAST);

		JTextArea txtrBienvenidosProgramaUsal = new JTextArea();
		txtrBienvenidosProgramaUsal.setEditable(false);
		txtrBienvenidosProgramaUsal.setForeground(Color.WHITE);
		txtrBienvenidosProgramaUsal.setBackground(Color.DARK_GRAY);
		txtrBienvenidosProgramaUsal.setFont(new Font("MingLiU-ExtB", Font.BOLD | Font.ITALIC, 13));
		txtrBienvenidosProgramaUsal.setText("\r\n\r\n\r\n\r\n   \r\n\r Bienvenidos Programa Usal\r\n");
		contentPane.add(txtrBienvenidosProgramaUsal, BorderLayout.CENTER);

		setVisible(true);

	}

	public MenuPrincipalController getMpc() {
		return mpc;
	}

	public JButton getBtnMenuCliente() {
		return btnMenuCliente;
	}

	public void setBtnMenuCliente(JButton btnMenuCliente) {
		this.btnMenuCliente = btnMenuCliente;
	}

	public JButton getBtnMenuVuelo() {
		return btnMenuVuelo;
	}

	public void setBtnMenuVuelo(JButton btnMenuVuelo) {
		this.btnMenuVuelo = btnMenuVuelo;
	}

	public JButton getBtnMenuVenta() {
		return btnMenuVenta;
	}

	public void setBtnMenuVenta(JButton btnMenuVenta) {
		this.btnMenuVenta = btnMenuVenta;
	}

	public JButton getBtnMenuLineasAereas() {
		return btnMenuLineasAereas;
	}

	public void setBtnMenuLineasAereas(JButton btnMenuLineasAereas) {
		this.btnMenuLineasAereas = btnMenuLineasAereas;
	}

}
