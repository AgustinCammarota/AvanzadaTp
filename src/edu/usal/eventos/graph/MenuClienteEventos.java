package edu.usal.eventos.graph;

import edu.usal.view.graph.ClienteMenu;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuClienteEventos implements ActionListener, ListSelectionListener {
	ClienteMenu vista;

	public MenuClienteEventos(ClienteMenu vista) {
		this.vista = vista;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (e.getSource().equals(vista.getListSelectionModel())) {
			int row = vista.getTable().getSelectedRow();
			if (row >= 0) {
				//habilitar botonoes
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
