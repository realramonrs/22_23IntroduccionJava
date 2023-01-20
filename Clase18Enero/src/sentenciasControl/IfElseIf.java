package sentenciasControl;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 9;
		//Quiero saber si es múltiplo de 5 o no
		if(numero % 5 == 0) {
			System.out.println("Es múltiplo de 5");
		}
		else {
			System.out.println("No es múltiplo de 5.");
		}
		
		//Si tiene un sobresaliente, notable , bien , aprobado, suspenso o error
		if(numero<0 || numero > 10) {
			System.out.println("Error en la nota.");
		}
		else if(numero<5) {
			System.out.println("Suspenso.");
		}
		else if(numero<7) {
			System.out.println("Bien");
		}
		else if(numero < 9) {
			System.out.println("Notable");
		}
		else {
			System.out.println("Sobresaliente");
		}
	}

}
