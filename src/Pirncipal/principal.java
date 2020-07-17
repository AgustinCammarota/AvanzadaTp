package Pirncipal;

import edu.usal.negocio.dao.Factory.*;
import edu.usal.negocio.dao.interfaces.*;
import edu.usal.negocio.dominio.*;
import edu.usal.util.Connections;
import edu.usal.util.DAOException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class principal {

    public static void main(String[] args) throws IOException, DAOException, SQLException {
        Paises pais = null;
        Provincias provincia = null;
        Aerolineas aerolinea = null;
        ClienteDAO clienteImple = ClienteFactory.getClienteDAO("Sql");
        PasaporteDAO pasaImple = PasaporteFactory.getPasaporteDAO("Sql");
        TelefonoDAO teleImple = TelefonoFactory.getTelefonoDAO("Sql");
        PasajeroFrecuenteDAO pasaFreImple = PasajeroFrecuenteFactory.getPasajeroFrecuenteDAO("Sql");
        DireccionDAO direImple = DireccionFactory.getDireccionDAO("Sql");
        PaisDAO paisImp = PaisFactory.getPaiDAO("Sql");
        ProvinciaDAO provinciaImp = ProvinciaFactory.getProvinciaDAO("Sql");
        AerolineaDAO aerolineaImp = AerolineaFactory.getAerolineaDAO("Sql");

        Connection con = Connections.getConnection();
        pais = paisImp.queryPais(9, con);
        provincia = provinciaImp.queryProvincia(1, con);
        aerolinea = aerolineaImp.queryAerolinea(1, con);

        LocalDate fechaemision = LocalDate.now();
        LocalDate fechavencimiento = LocalDate.now();
        LocalDate fechanacimiento = LocalDate.now();
        PasajerosFrecuentes ps = new PasajerosFrecuentes("dsadsads", "lalalan", aerolinea, null);
        Pasaportes pasaporte = new Pasaportes("AOF123", "Argen", fechaemision, fechavencimiento, pais, null);
        Direcciones direccion = new Direcciones("Av Espa�a", "1154", "Lujan", "6700", pais, provincia, null);
        Telefonos telefono = new Telefonos("232356", "2323122", "2323054", null);
        Clientes cliente = new Clientes("Jose", "Martinez Gomez", "5546", "580890", "Jose.martinezgomez@usal.edu.ar", fechanacimiento, null, pasaporte, telefono, ps, direccion);


        try {
            if (clienteImple.addCliente(cliente, con) && pasaImple.addPasaporte(cliente, con) && pasaFreImple.addPasajeroFrecuente(cliente, con) && teleImple.addTelefono(cliente, con) &&
                    direImple.addDireccion(cliente, con)) {
                Connections.Commit(con);
                System.out.println("Se pudo guardar el cliente");
            }
            System.out.println(clienteImple.queryCliente(18, con));
            Connections.closeConnection(con);
        } catch (SQLException r) {
            Connections.RollBack(con);
            System.out.println("SE HZO EL ROLLBACK");
            r.printStackTrace();
        }
    }
}