package edu.usal.negocio.dao.implementacion;

import edu.usal.negocio.dao.interfaces.VueloDAO;
import edu.usal.negocio.dominio.Vuelos;
import edu.usal.util.PropertiesUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VueloDAOImpSerializable implements VueloDAO {

	private FileOutputStream fileOut;
	private FileInputStream fileInput;
	private ObjectOutputStream objectOut;
	private ObjectInputStream objectInput;
	private File file;


	@Override
	public boolean addVuelo(Vuelos vuelo) throws FileNotFoundException, IOException {

		List<Vuelos> listado = this.getAllVuelos();
		listado.add(vuelo);
		this.saveAllVuelos(listado);
		return true;

	}

	@Override
	public boolean updateVuelo(long Id, Vuelos vuelo) throws FileNotFoundException, IOException {

		List<Vuelos> listado = this.getAllVuelos();
		for (Vuelos vuelos : listado) {
			if (vuelos.getIdVuelo() == Id) {
				listado.remove(vuelos);
				listado.add(vuelo);
				this.saveAllVuelos(listado);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteVuelo(long Id) throws FileNotFoundException, IOException {

		List<Vuelos> listado = this.getAllVuelos();
		for (Vuelos vuelos : listado) {
			if (vuelos.getIdVuelo() == Id) {
				listado.remove(vuelos);
				this.saveAllVuelos(listado);
				return true;
			}
		}

		return false;
	}

	@Override
	public Vuelos queryVuelo(long Id) throws FileNotFoundException, IOException {

		List<Vuelos> listado = getAllVuelos();
		for (Vuelos vuelos : listado) {
			if (vuelos.getIdVuelo() == Id) {
				return vuelos;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Vuelos> getAllVuelos() throws FileNotFoundException, IOException {

		this.file = new File(PropertiesUtil.getPathClientes(), PropertiesUtil.getFileVuelos());

		if (!file.exists()) {
			file = new File(PropertiesUtil.getPathClientes());
			file.mkdirs();
			file = new File(PropertiesUtil.getPathClientes(), PropertiesUtil.getFileVuelos());
			file.createNewFile();
			file = new File(PropertiesUtil.getPathClientes(), PropertiesUtil.getFileVuelos());
			List<Vuelos> vuelo = new ArrayList<Vuelos>();
			this.saveAllVuelos(vuelo);
			return vuelo;
		}

		this.fileInput = new FileInputStream(file);
		this.objectInput = new ObjectInputStream(fileInput);

		try {
			List<Vuelos> vuelo = (List<Vuelos>) objectInput.readObject();
			this.fileInput.close();
			this.objectInput.close();
			return vuelo;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}

	public void saveAllVuelos(List<Vuelos> listado) throws FileNotFoundException, IOException {

		this.file = new File(PropertiesUtil.getPathClientes(), PropertiesUtil.getFileVuelos());
		this.fileOut = new FileOutputStream(file);
		this.objectOut = new ObjectOutputStream(fileOut);
		this.objectOut.writeObject(listado);
		this.objectOut.close();
	}
}
