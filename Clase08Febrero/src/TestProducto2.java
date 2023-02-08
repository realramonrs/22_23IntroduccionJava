
public class TestProducto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1 = new Producto();
		Producto p2;
		try {
			p2 = new Producto("tR5","Zanussi",5000);
			System.out.println(p2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		Producto p3;
		try {
			p3 = new Producto("Y7","Opel",20000);
			System.out.println(p3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(p1);
		
		
	}

}
