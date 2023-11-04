import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//Clase ServidorCalculadora, la cual hereda de UnicastRemoteOject e implemenetar la interface ServicioCalculadora
public class ServidorCalculadora extends UnicastRemoteObject implements ServicioCalculadora {
	//Costructor de la calse, validamos que no surja un exepcion, en caso de ser asi la lanzamos a try
	public ServidorCalculadora() throws RemoteException{
		float num1, num2;
	}
	//Metodo de suma, el cual emplea 2 valores para ser invocado y retorna el resultado
	public float suma(float num1,float num2) throws RemoteException{
		return num1 + num2;
	}
	//Metodo de resta, el cual emplea 2 valores para ser invocado y retorna el resultado
	public float resta(float num1,float num2) throws RemoteException{
		return num1 - num2;
	}
	//Metodo de multiplicacion, el cual emplea 2 valores para ser invocado y retorna el resultado
	public float mul(float num1,float num2) throws RemoteException{
		return num1 * num2;
	}
	//Metodo de division, el cual emplea 2 valores para ser invocado y retorna el resultado
	public float div(float num1,float num2) throws RemoteException{
		return num1 / num2;
	}
}