package edu.usal.negocio.dao.implementacion;

import edu.usal.negocio.dao.interfaces.DireccionDAO;
import edu.usal.negocio.dominio.Clientes;
import edu.usal.negocio.dominio.Direcciones;
import edu.usal.util.DAOException;

import java.sql.*;

public class DireccionDAOImpSQL implements DireccionDAO {

	final String INSERT = "INSERT INTO direcciones (calle, altura, ciudad, codigo_postal, id_pais, id_cliente, id_provincia) VALUES(?,?,?,?,?,?,?)";
	final String UPDATE = "UPDATE direcciones SET calle=?, altura=?, ciudad=?, codigo_postal=?, id_pais=?, id_provincia=? WHERE id_direccion=?";
	final String DELETE = "DELETE FROM direcciones WHERE id_direccion=?";

	@Override
	public boolean addDireccion(Clientes cliente, Connection cn) throws SQLException, DAOException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		cn.setAutoCommit(false);
		Direcciones direccion = new Direcciones();

		ps = cn.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, cliente.getDireccion().getCalle());
		ps.setString(2, cliente.getDireccion().getAltura());
		ps.setString(3, cliente.getDireccion().getCiudad());
		ps.setString(4, cliente.getDireccion().getCodigoPostal());
		ps.setLong(5, cliente.getDireccion().getPais().getIdPais());
		ps.setLong(6, cliente.getIdCliente());
		if (cliente.getDireccion().getPais().getIdPais() == 9) {
			ps.setLong(7, cliente.getDireccion().getProvincia().getIdProvincia());
		} else {
			ps.setNull(7, Type.INT);
		}
		rs = ps.getGeneratedKeys();

		while (rs.next())
			direccion.setIdDireccion((long) rs.getInt(1));
		cliente.setDireccion(direccion);

		if (ps.executeUpdate() > 0) {
			return true;
		}
		if (rs != null) {
			rs.close();
		}
		if (ps != null) {
			ps.close();
		}
		return false;
	}

	@Override
	public boolean updateDireccion(Clientes cliente, Connection cn) throws DAOException, SQLException {
		PreparedStatement ps = null;

		ps = cn.prepareStatement(UPDATE, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, cliente.getDireccion().getCalle());
		ps.setString(2, cliente.getDireccion().getAltura());
		ps.setString(3, cliente.getDireccion().getCiudad());
		ps.setString(4, cliente.getDireccion().getCodigoPostal());
		ps.setLong(5, cliente.getDireccion().getPais().getIdPais());
		if (cliente.getDireccion().getPais().getIdPais() == 9) {
			ps.setLong(7, cliente.getDireccion().getProvincia().getIdProvincia());
		} else {
			ps.setNull(7, Type.LONG);
		}
		if (ps.executeUpdate() > 0) {
			return true;
		}
		if (ps != null) {
			ps.close();
		}
		return false;

	}

	@Override
	public boolean deleteDireccion(Clientes cliente, Connection cn) throws DAOException, SQLException {
		PreparedStatement ps = null;
		cn.setAutoCommit(false);

		try {
			ps = cn.prepareStatement(DELETE);
			ps.setLong(1, cliente.getDireccion().getIdDireccion());
			ps.executeUpdate();

		} catch (SQLException e) {
			cn.rollback();
			throw new DAOException("EROOR EN SQL addCliente", e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					throw new DAOException("ERROR EN SQL closePSCliente", e);
				}
			}
		}
		return true;
	}

}
