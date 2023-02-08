import java.time.LocalDate;

public class VentaPlus {

	private String codigo;
	private LocalDate fecha;
	private Producto producto;
	
	public VentaPlus(String codigo, Producto producto) {
		
		this.codigo = codigo;
		
		this.producto = producto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "VentaPlus [codigo=" + codigo + ", fecha=" + fecha + ", producto=" + producto + "]";
	}
	
	
	
}
