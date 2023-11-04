//Librerias utulizadas
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
//Clase ClienteRMI
public class ClienteRMI{
	//Funcion pricipal de la clase
	public static void main(String[] args) {
		//Objeto usado para leer datos del teclado
		Scanner teclado = new Scanner(System.in);
		//Variables en donde se almacenarán los numeros necesarios para realizar las operadciones
		float num1,num2;
		//Variables usadas para ciclos
		int opc,salir=0;
		try{
			//Realizaso el registro de la conexion con el servidor (en este caso localhost) y el pueto 1099
			Registry miRegistro = LocateRegistry.getRegistry("loclahost",1099);
			//Asiganamos el objeto devolueto por RMI, realizando un cast
			 ServicioCalculadora cal  = (ServicioCalculadora)Naming.lookup("rmi://localhost/ServicioCalculadora");
			//Emplemos un ciclo do-while, repetir el menu y la operacion a realizar, asi como el ingreso de numeros
			do{
				//Imprimimos en la consola grafica de comandos
				System.out.println("\n***Calculadora***\n");
				System.out.println("1. Suma");
				System.out.println("2. Resta");
				System.out.println("3. Multiplicacion");
				System.out.println("4. Division");
				System.out.println("5. Salir");
				System.out.println("Operacion a realizar: ");
				//Asoganamos el valor de la opcion del usuario, ingresada por teclado a la variable opc
				opc = teclado.nextInt();
				//Pedir numeros 
				System.out.println("Ingrese el 1er numero: ");
				num1= teclado.nextFloat();
				System.out.println("Ingrese el 2do numero: ");
				num2= teclado.nextFloat();	
				//Usamos switch para llamar a la operacion solicitada por el usuario
				switch(opc)
				{
					//Caso 1(suma), mostramos los valores ingresados y el resultado de la operacion, el cual nos 
					//proporcionara el metodo solicitado por RMI
					case 1:{
						System.out.println(num1 + "+" + num2 + "=" + cal.suma(num1,num2));

					}break;
					//Caso 2(resta), mostramos los valores ingresados y el resultado de la operacion, el cual nos 
					//proporcionara el metodo solicitado por RMI
					case 2:{
						System.out.println(num1 + "-" + num2 + "=" + cal.resta(num1,num2));

					}break;
					//Caso 3(multiplicacion), mostramos los valores ingresados y el resultado de la operacion, el cual nos 
					//proporcionara el metodo solicitado por RMI
					case 3:{
						
						System.out.println(num1 + "*" + num2 + "=" + cal.mul(num1,num2));

					}break;
					//Caso 4(division), mostramos los valores ingresados y el resultado de la operacion, el cual nos 
					//proporcionara el metodo solicitado por RMI
					case 4:{
					
						System.out.println(num1 + "/" + num2 + "=" + cal.div(num1,num2));

					}break;
					//En caso de que la opcion sea diferente de 1 a 4, saldremos del programa
					default:{
						salir = 1;//salir será igual a 1
					}
				}//switch

			}while(salir != 1); //Es verdad mientreas que salir sea diferente de 1
			System.exit(0);
		}//try
		catch (Exception e) {
            e.printStackTrace();
		}
	
	}//void main
}//class