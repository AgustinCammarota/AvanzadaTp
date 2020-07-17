package edu.usal.negocio.dao.interfaces;

import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.util.DAOException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface LineaAereaDAO {
	public boolean addLineaAerea(LineasAereas lineaAerea) throws DAOException, SQLException, IOException;

	public void updateLineaAerea(LineasAereas lineaAerea) throws DAOException, IOException;

	public boolean deleteLineaAerea(LineasAereas lineaAerea) throws DAOException, SQLException, IOException;

	public LineasAereas queryLineaAerea(int Id) throws DAOException, IOException;

	public List<LineasAereas> getAllLineasAereas() throws DAOException, IOException;
}
