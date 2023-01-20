package sentenciasControl;
import java.time.*;

public class SentenciaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Evaluar valores discretos de una variable
		char opcion = 'u';
		//Si opcion = a Mando un mensaje
		//Si opcion = b Muestro la fecha actual
		//Si opcion = c Sumo dos números
		
		switch(opcion) {
		case 'a':
			System.out.println("Java es increíble!");
			break;
		case 'b':
			System.out.println("Hoy es: " + LocalDate.now().toString());
			break;
		case 'c':
			int x = 9,y =7;
			
			int res = x + y;
			System.out.println("x + y= " + res);
			break;
			default:
				System.out.println("Opción errónea");
				break;
		}
		
		
		if(opcion == 'a') {
			
		}
		else if(opcion == 'b') {
			
		}
		else if (opcion == 'c') {
			
		}
		else {
			
		}
	}

}
