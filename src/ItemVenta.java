
public class ItemVenta 
{
	
	//Atributos
	private int cantidad;
	private Producto producto;
	
	
	//Constructor
	public ItemVenta(int cantidad, Producto producto) {
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public float calcularSubtotal()
	{
		return cantidad * producto.getPrecio();
	}
	
	public void actualizarStock()
	{
		producto.descontarStock(cantidad);
	}
	

}
