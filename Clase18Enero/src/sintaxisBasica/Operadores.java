package sintaxisBasica;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores: S�mbolos que realizan alguna funci�n
		//Matem�ticos: +,-,*,/, %  binarios
		//Asignaci�n: = , +=,-=,*=,/=
		//Operadores ++ y --
		int x = 5,y = 9;
		int resultado = x + y;
		
		float resultadoDivision = (float)x/y;
		
		System.out.println("Resultado x/y = " + resultadoDivision);
		
		byte c1 = 124,c2 = 40,resultadoByte;
		resultadoByte = (byte)(c1 + c2);
		System.out.println("c1 + c2 = " + resultadoByte);
		
		//Operadores +=, -=
		int r = 10;
		r = r + 10;
		r+=10;
		
		//Operadores ++ y -- le suman 1 a la variable sobre la que act�an
		int o1 = 10;
		int o2 = o1++;
		o2++;
		++o2;
		System.out.println("o2 = " + o2);
		System.out.println("o1 = " + o1);
		
		//Operadores relacionales < , <= , > , >=, == , !=
		
		boolean condicion1 = o1>10;
		boolean condicion2 = o1!=10;
		
		//Operadores l�gicos: 
		// Y L�gico : && --> Devuelve true si las dos condiciones son true
		boolean c3 = o1>10 && o1 % 2 == 0;
		// O L�gico : || --> Devuelve true si una de las condiciones es true
		
		boolean c4 = o1>10 || o1 % 2 == 0;
		
		//No l�gico: ! --> Niega la condicion que va despu�s
		boolean c5 = !c4;
	}

}
