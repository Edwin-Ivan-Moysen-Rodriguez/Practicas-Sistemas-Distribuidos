import java.rmi.Remote;
import java.rmi.RemoteException;
//interface ServicioCalculadora, la cual hereda de la clase Remote
public interface ServicioCalculadora extends Remote {
   //Servicios los cuales proporciona nuestro servidor RMI, retonan un dato tipo float y requiere de 2 argumentos
	public float suma(float num1,float num2) throws RemoteException;
	public float resta(float num1,float num2) throws RemoteException;
	public float mul(float num1,float num2) throws RemoteException;
	public float div(float num1,float num2) throws RemoteException;
}