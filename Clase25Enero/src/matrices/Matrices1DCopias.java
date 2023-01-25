package matrices;

public class Matrices1DCopias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] original = {4,8,0,8,1};
		//Copiar estos valores a otro array:
		int [] copia = new int[original.length+1];
		
		//copia = original; Esto no hace una copia, simplemente
		//redirige la referencia copia a la misma zona de datos a la que apunta
		//original.
		
		for(int i = 0;i<original.length;i++) {
			copia[i] = original[i];
		}
		
		System.out.println("Array original antes de la copia : ");
		for(int i = 0;i<original.length;i++) {
			System.out.print(original[i] + " ");
		}
		System.out.println();
		original = copia;
		
		System.out.println("Array original : ");
		for(int i = 0;i<original.length;i++) {
			System.out.print(original[i] + " ");
		}
		
		
	}

}
