
public class TestVenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Venta v1 = new Venta("W34","W3");
		System.out.println(v1);
		
		try {
			Producto p1 = new Producto("W6","HP",900);
			VentaPlus v2 = new VentaPlus("U32",p1);
			
			// Que producto he vendido
			System.out.println("Producto vendido: ");
			System.out.println(v2.getProducto());
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
