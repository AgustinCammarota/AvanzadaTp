package edu.usal.negocio.dao.interfaces;

import edu.usal.negocio.dominio.Clientes;
import edu.usal.util.DAOException;

import java.sql.Connection;
import java.sql.SQLException;


public interface DireccionDAO {
	public boolean addDireccion(Clientes cliente, Connection cn) throws SQLException, DAOException;

	public boolean updateDireccion(Clientes cliente, Connection cn) throws DAOException, SQLException;

	public boolean deleteDireccion(Clientes cliente, Connection cn) throws DAOException, SQLException;
}
