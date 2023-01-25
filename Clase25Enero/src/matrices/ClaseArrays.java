package matrices;

import java.util.Arrays;
import java.util.Random;

public class ClaseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = new int[10];
		//Llenar el array con números aleatorios 5 y 10
		Random aleatorio = new Random();
		
		for(int i = 0;i<numeros.length;i++) {
			numeros[i] = aleatorio.nextInt(10);
		}
		
		//La clase Arrays contiene métodos útiles para trabajar con matrices
		//Printar por pantalla todo el array
		
		System.out.println(Arrays.toString(numeros));
		
		//Ordenar de menor a mayor los elementos del array
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		//Copiar los valores de un array en otro array
		int [] copia = Arrays.copyOf(numeros, numeros.length);
		
		//Buscar un valor en un array ordenado --> BinarySearch
		int valorBuscado = 1;
		int posicion = Arrays.binarySearch(numeros, valorBuscado);
		System.out.println(valorBuscado + " posicion: " + posicion);
		
	}

}
