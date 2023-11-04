import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
//Clase ServidroRMI
public class ServidorRMI {
    //Funcion prinicipal de nuestra clase
    public static void main(String[] args) {
        //Empleamos un bloque try-cath con la finalidad de validar si surge alguan exepcion
        try {
            //Declaramos un objeto de la interface ServicioCalculadora, la cual le asiganamos
            //un objeto de la clase ServidorCalculadora
            ServicioCalculadora servicio = new ServidorCalculadora();
            LocateRegistry.createRegistry(1099); // Puerto predeterminado para RMI
            Naming.rebind("ServicioCalculadora", servicio); // Registra el servicio en el registro RMI
            System.out.println("Servidor RMI iniciado.");//Indicamos que el servicio RMI está inciado
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}