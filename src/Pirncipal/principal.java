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

        //FUNCIONA CLIENTE, DIRECCION, PAIS, PROVINCIA, AEROLINEA, TELEFONO, (SACAR AUTOCOMIT)

        //PASAJERO FRECUENTE, PASAPORTE.

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

        if(!con.isClosed()){
            System.out.println("Conectado");
        }else{
            System.out.println("no conectado");
        }

        LocalDate fechaemision = LocalDate.now();
        LocalDate fechavencimiento = LocalDate.now();
        LocalDate fechanacimiento = LocalDate.now();
        PasajerosFrecuentes ps = new PasajerosFrecuentes("asdasd", "lalalan", aerolinea, null);
        Pasaportes pasaporte = new Pasaportes("AOF123", "Argen", fechaemision, fechavencimiento, pais, null);
        Direcciones direccion = new Direcciones("San Martin", "1154", "Lujan", "6700", pais, provincia, null);
        Telefonos telefono = new Telefonos("1111", "2323122", "2323054", null);
        Clientes cliente = new Clientes("Agustin", "Martinez Gomez", "5546", "580890", "Jose.martinezgomez@usal.edu.ar", fechanacimiento, 34L, pasaporte, telefono, ps, direccion);


                // ADD CLIENTE
//        try {
//
//            if (clienteImple.addCliente(cliente, con) && pasaImple.addPasaporte(cliente, con) && pasaFreImple.addPasajeroFrecuente(cliente, con) && teleImple.addTelefono(cliente, con) &&
//                    direImple.addDireccion(cliente, con)) {
//                Connections.Commit(con);
//                System.out.println("Se pudo guardar el cliente");
//            }
//           // System.out.println(clienteImple.queryCliente(18, con));
//            Connections.closeConnection(con);
//        } catch (SQLException r) {
//            Connections.RollBack(con);
//            System.out.println("SE HZO EL ROLLBACK");
//            r.printStackTrace();
//        }

            // UPDATE CLIENTE

//        if(clienteImple.updateCliente(cliente,con) && pasaImple.updatePasaporte(cliente,con) && pasaFreImple.updatePasajeroFrecuente(cliente,con) && teleImple.updateTelefono(cliente,con) &&
//            direImple.updateDireccion(cliente,con)){
//            Connections.Commit(con);
//            System.out.println("Se actualizaron los datos del cliente");
//        }else{
//            Connections.RollBack(con);
//            System.out.println("No se pudo actualizar ");
//        }

            // DELETE CLIENTE

        if(clienteImple.deleteCliente(cliente,con) && pasaImple.deletePasaporte(cliente,con) && pasaFreImple.deletePasajeroFrecuente(cliente,con) && teleImple.deleteTelefono(cliente,con) &&
            direImple.deleteDireccion(cliente,con)){
            Connections.Commit(con);
            System.out.println("Se pudo eliminar el cliente y todos sus objetos");
        }else{
            Connections.RollBack(con);
            System.out.println("No se pudo eliminar");
        }




        // GETONE SOLO FUNCIONA CON CLIENTES QUE TENGAN TODOS LOS DATOS.
//        Clientes cliente1;
//              cliente1 = clienteImple.queryCliente( 18L, con);
//        System.out.println(cliente1.toString());

//        clienteImple.updateCliente(cliente, con);

//        clienteImple.deleteCliente(cliente, con);

    }
}