package edu.usal.eventos.graph;

import edu.usal.view.graph.MenuPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PrincipalEventos implements ActionListener {
	MenuPrincipal vista;

	public PrincipalEventos(MenuPrincipal vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(vista.getBtnMenuCliente())) {
			vista.getMpc().EjecutarMenuCliente();
		}
		if (e.getSource().equals(vista.getBtnMenuVuelo())) {
		}

	}

}
