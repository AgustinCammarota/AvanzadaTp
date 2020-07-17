package edu.usal.controler.graph;

import edu.usal.negocio.dao.Factory.ClienteFactory;
import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.negocio.dominio.Clientes;
import edu.usal.util.Connections;
import edu.usal.util.DAOException;
import edu.usal.view.graph.ClienteMenu;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class MenuClienteController {
	private List<Clientes> cliente;
	MenuPrincipalController mpc;
	ClienteMenu cm;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public MenuClienteController(MenuPrincipalController mpc) {
		this.mpc = mpc;
		cm = new ClienteMenu(this);
	}

	public MenuClienteController() {

	}

	public JTable CargarTable(JTable table) {
		int numCols = table.getModel().getColumnCount();
		Object[] fila = new Object[numCols];
		ClienteDAO clienteDAO = ClienteFactory.getClienteDAO("Sql");
		Connection cn = Connections.getConnection();
		try {
			cliente = clienteDAO.getAllClientes(cn);
		} catch (IOException | DAOException | SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al cargar los clientes" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		for (Clientes c : cliente) {
			fila[0] = c.getIdCliente().toString();
			fila[1] = c.getNombre();
			fila[2] = c.getApellido();
			fila[3] = c.getFechaNacimiento().format(formatter);
			fila[4] = c.getDni();
			fila[5] = c.getCuit();
			fila[6] = c.getEmail();
			fila[7] = c.getDireccion().getCalle();
			fila[8] = c.getDireccion().getAltura();
			fila[9] = c.getDireccion().getCodigoPostal();
			fila[10] = c.getDireccion().getCiudad();
			fila[11] = c.getDireccion().getPais().getNombrePais();
			fila[12] = c.getDireccion().getProvincia().getNombreProvincia();
			fila[13] = c.getPasaporte().getNumeroPasaporte();
			fila[14] = c.getPasaporte().getAutoridadEmision();
			fila[15] = c.getPasaporte().getFechaEmision().format(formatter);
			fila[16] = c.getPasaporte().getFechaVencimiento().format(formatter);
			fila[17] = c.getPasaporte().getPais().getNombrePais();
			fila[18] = c.getTelefono().getNumeroPersonal();
			fila[19] = c.getTelefono().getNumeroCelular();
			fila[20] = c.getTelefono().getNumeroLaboral();
			fila[21] = c.getPasajerofrecuente().getAlianza();
			fila[22] = c.getPasajerofrecuente().getCategoria();
			fila[23] = c.getPasajerofrecuente().getAerolinea().getNombreAerolinea();

			((DefaultTableModel) table.getModel()).addRow(fila);
		}
		return table;
	}
}
