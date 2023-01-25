package matrices;

import java.util.Scanner;

public class ForMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []numeros = {9,8,4,5,1};
		
		//Este for se utiliza cuando me interesa recorrer la matriz
		//solamente para leer los valores.
		//Contar números pares
		int contador = 0;
		for(int n : numeros) {
			if(n%2==0) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " números pares.");
		
		//sumar todos los valores del array
		int suma = 0;
		for(int n : numeros) {
			suma = suma + n;
		}
		
		System.out.println("La suma es : " + suma);
		//Buscar un número para saber si está o no está
		int numero;
		Scanner lector = new Scanner(System.in);
		boolean encontrado = false;
		System.out.println("Introduce el número que quieres buscar: ");
		numero = lector.nextInt();
		for(int n : numeros) {
			if(n == numero) {
				encontrado = true;
				System.out.println("Encontrado.");
				break;
			}			
		}
		if(!encontrado ) {
			System.out.println("No encontrado.");
		}
		
		if(true) {
			
		}
		
		//Mostrar por pantalla los valores del array
	}

}
