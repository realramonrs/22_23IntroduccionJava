import java.util.ArrayList;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear un Producto
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		String codigo="Q5" ;
		
		//Producto p3 = new Producto("W3", "Bosch", 900);
		
		Producto ps[] = new Producto[100];
		ArrayList<Producto> lista = new ArrayList<Producto>(10);
		
		
		//Modificar valores del objeto p1
		p1.setCodigo("Q2");
		
		p1.setMarca("Lenovo");
		p1.setPrecio( 900);
		
		System.out.println("Precio de p1: " + p1);
		
		//Aplicar un 15% a p1
		p1.aplicarDescuento(15);
		
		System.out.println("Precio con descuento : " + p1.getPrecio());
		
		//Mostrar toda la info que hay en p1
		System.out.println(p1.toString());
		
	}

}
