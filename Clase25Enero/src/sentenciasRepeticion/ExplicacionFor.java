package sentenciasRepeticion;

public class ExplicacionFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int control = 1;control<=50;control++) {
			System.out.print(control + " ");
			
		}
		System.out.println();
		//Mostrar sólo los 5 primeros números múltiplos de 3 y 7 por debajo de 1000
	System.out.println("Números múltiplos de 3 y 7");
	int contador = 0;
		for(int control = 21; control<1000 && contador<5;control++) {
			
			if(control % 3 == 0 && control % 7 == 0) {
				System.out.print(control + " ");
				contador++;
			}
			//if(contador==5) {
			//	break; //Salir precipitadamente de un bucle
			//}
		}
	
	
	
	
	}

}
