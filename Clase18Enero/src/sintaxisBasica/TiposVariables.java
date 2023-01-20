package sintaxisBasica;

public class TiposVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comentario de una linea
		/*
		 * Comentarios de 
		 * varias lineas
		 */
		
		//Tipos de variables numéricas enteras:
		byte b1 = 0; //-128 a 127
		short s1; //-32760 to 32760
		int i1; // 4 bytes
		long l1; // 8 bytes
		
		//Tipos de variables numéricas reales:
		float f1 = 9.4f;
		double d1;
		
		//Caracteres alfanuméricas
		char caracter = 'a';
		char caracter2 = '4';
		
		
		//booleanas
		boolean condicion = true;
		
		String cadena = "Me gusta Java";
		
		
		//******************* Fin Tipo Variables **********/
		//Declaración e Inicialización de variables
		int numero,numero2,numero3;
		numero = 1;
		numero2 = 4;
		
		float temp1 = 4.5f,temp2=9.6f,temp3=4.5f;
		double t1 = 5.678;
		
		//Valores > capacidad que int hay que añadir sufijo L
		long numeroMuyAlto = 90_000_000_000L;
		
		//Modificación de los valores de una variable:
		int x1 = 100;
		//Sumar 1 a x1
		x1 = x1 + 1;
		
		//Mandar mensaje por consola
		System.out.println("Hola Mundo");
		System.out.println();
		System.out.print("El valor de x1 es: " + x1 + " ");
		System.out.println("El valor de t1 es: " + t1);
		System.out.println();
		
		
		
		
		
		

	}

}
