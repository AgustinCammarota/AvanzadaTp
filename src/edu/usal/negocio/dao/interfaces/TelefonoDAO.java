package edu.usal.negocio.dao.interfaces;

import edu.usal.negocio.dominio.Clientes;
import edu.usal.util.DAOException;

import java.sql.Connection;
import java.sql.SQLException;

public interface TelefonoDAO {
	public boolean addTelefono(Clientes cliente, Connection cn) throws DAOException, SQLException;

	public boolean updateTelefono(Clientes cliente, Connection cn) throws DAOException, SQLException;

	public boolean deleteTelefono(Clientes cliente, Connection cn) throws DAOException, SQLException;
}
