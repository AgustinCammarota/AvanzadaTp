package edu.usal.negocio.dao.interfaces;

import edu.usal.negocio.dominio.Paises;
import edu.usal.util.DAOException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;

public interface PaisDAO {
	public Hashtable<Integer, String> leerPaises() throws FileNotFoundException, IOException;

	public Paises queryPais(int Id, Connection con) throws DAOException, SQLException;

	public List<Paises> getAllPaises(Connection con) throws SQLException;
}
