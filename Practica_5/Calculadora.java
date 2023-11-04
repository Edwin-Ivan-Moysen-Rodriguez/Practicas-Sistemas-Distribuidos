//Libreria utilizada para declarar un objeto de la clase 
//Scanner, la cual nos ayuda a poder leer los datos ingresados
//por medio del teclado
import java.util.Scanner;
//Declaración de la clase Calculadora
public class Calculadora{
	//Objeto "teclado", perteneciente a la case Scanner
	public static Scanner teclado = new Scanner(System.in);
	//Funciones miembro o metodos, estaticos
	//Metodo suma, el cual realizar la suma de 2 numeros, requiere
	//2 argumentos para poder llamarlo
	public static float f_suma(float num1,float num2){
		float suma = num1 + num2;//Suma de 2 números flotantes
		return suma;//Retornamos el resultado
	}
	//Metodo resta, el cual realizar la diferencia de 2 numeros, requiere
	//2 argumentos para poder llamarlo
	public static float f_resta(float num1,float num2){
		float resta = num1 -  num2;//Resta de 2 números flotantes
		return resta;//Retornamos el resultado
	}
	//Metodo mul, el cual realizar el producto de 2 numeros, requiere
	//2 argumentos para poder llamarlo
	public static float f_mul(float num1,float num2){
		float mul = num1 * num2;//Multiplica de 2 números flotantes
		return mul;//Retona el resultado
	}
	//Metodo division, el cual realizar la division de 2 numeros, requiere
	//2 argumentos para poder llamarlo
	public static float f_division(float num1,float num2){
		float div = num1 / num2;//Divicion de 2 números flotantes
		return div;//Retornamos el resultado
	}
	//Funcion principal del programa
	public static void main(String [] args )
	{
		//Utilizamos 2 variables flotantes, en las cuales se
		//almacenarán los numeros, con los cuales rea
		float num1,num2;
		int opc,salir=0;
		do{

			System.out.println("\n***Calculadora***\n");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("5. Salir");
			System.out.println("Operacion a realizar: ");
			opc = teclado.nextInt();

			//Pedir numeros 
			System.out.println("Ingrese el 1er numero: ");
			num1= teclado.nextFloat();
			System.out.println("Ingrese el 2do numero: ");
			num2= teclado.nextFloat();	
			//Menu
				switch(opc)
				{
								
					case 1:{
						System.out.println(num1 + "+" + num2 + "=" + f_suma(num1,num2));

					}break;
					case 2:{
						System.out.println(num1 + "-" + num2 + "=" + f_resta(num1,num2));

					}break;
					case 3:{
						
						System.out.println(num1 + "*" + num2 + "=" + f_mul(num1,num2));

					}break;
					case 4:{
					
						System.out.println(num1 + "/" + num2 + "=" + f_division(num1,num2));

					}break;
					default:{
						salir = 1;
					}
				}

		}while(salir != 1);
		System.exit(0);

	}
}