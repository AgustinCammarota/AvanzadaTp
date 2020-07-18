package Pirncipal;

import edu.usal.negocio.dao.Factory.*;
import edu.usal.negocio.dao.implementacion.PasajeroFrecuenteDAOImpSQL;
import edu.usal.negocio.dao.interfaces.*;
import edu.usal.negocio.dominio.*;
import edu.usal.util.Connections;
import edu.usal.util.DAOException;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class pasajerofrecuente  {
    public static void main(String[] args) throws SQLException, DAOException {

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
        PasajerosFrecuentes ps = new PasajerosFrecuentes("proban", "lalalan", aerolinea, null);
        Pasaportes pasaporte = new Pasaportes("AOF123", "Argen", fechaemision, fechavencimiento, pais, null);
        Direcciones direccion = new Direcciones("Av Espana", "1154", "Lujan", "6700", pais, provincia, null);
        Telefonos telefono = new Telefonos("232356", "2323122", "2323054", null);
        Clientes cliente = new Clientes("Agustin", "Martinez Gomez", "5546", "580890", "Jose.martinezgomez@usal.edu.ar", fechanacimiento, 28L, pasaporte, telefono, ps, direccion);

        PasajeroFrecuenteDAO pasajeroImp = new PasajeroFrecuenteDAOImpSQL();

        //Update pasajero frecuente
 //       if(pasajeroImp.updatePasajeroFrecuente(cliente,con)){
 //           System.out.println("Se actualizo el pasajero frecuente");
 //       }else{
 //           System.out.println("No se pudo actualizar el pasajero frecuente");
 //       }

        //delete pasajero frecuente

 //       if(pasajeroImp.deletePasajeroFrecuente(cliente,con)){
 //           System.out.println("Se pudo borrar");
 //       }else{
 //           System.out.println("No se pudo borrar");
 //       }



    }
}
