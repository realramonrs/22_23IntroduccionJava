package matrices;

import java.util.ArrayList;

public class MatricesDinamicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alumnos = new ArrayList<String>();
		
		//A�adir elementos a esta lista .add(String)
		alumnos.add("Mat�as Beiro");
		alumnos.add("Juan Gul�as");
		alumnos.add("Mar�a S�nchez");
		
		// Saber n�mero de elementos almacenados .size()
		int numeroAlumnos = alumnos.size();
		
		for(int i = 0;i<alumnos.size();i++) {
			System.out.println(alumnos.get(i));
		}
		System.out.println();
		//Eliminar elementos
		alumnos.remove(1);
		
		for(String s : alumnos) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
