
public class Producto {

	private String codigo;
	private String marca;
	private float precio;
	
	//Constructores :
	//Constructor por defecto
	public Producto() {
		precio = 1000;
		marca = null;
		codigo = null;
	}
	
	public Producto(String codigo,String marca,float precio) throws Exception {
		
		if(setCodigo(codigo)==false) {
			throw new Exception("Error en el código, no se ha podido crear el producto");
		}
		
		this.marca = marca;
		this.precio = precio;
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	//Métodos de acceso: set y get
	public boolean setCodigo(String cod) {
		//Validar el cod -->formato A9
		if(cod.length()==2) {
			
			if(Character.isLetter(cod.charAt(0)) && Character.isDigit(cod.charAt(1))){
				
			    codigo = cod;
			    return true;
				
			}
		}
		return false;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	
	
	
	
	//Métodos de instancia
	//aplicarDescuento
	
	public void aplicarDescuento(int porcentaje) {
		
		precio = precio - (precio*porcentaje)/100;
	}
	
	public void aplicarAumento(int porcentaje) {
		precio = precio + (precio*porcentaje)/100;
	}
	
	@Override	
	public String toString() {
		return "Codigo: " + codigo + " Marca: " + marca + " Precio: " + precio;
	}
	
}
