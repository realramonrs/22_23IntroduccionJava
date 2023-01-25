
package sentenciasRepeticion;

import java.util.*; 
public class ExplicacionDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Do While --> Muy utilizado para procesar entradas al programa
		//Solicitar al usuario un número positivo:
		Scanner lector = new Scanner(System.in);
		int numero=0;
		
		do {
		System.out.println("Introduzca un número positivo : ");
		numero = lector.nextInt();
		System.out.println("Número introducido : " + numero);
		}
		while(numero<0);
		
	}

}
