import java.time.LocalDate;
import java.util.Vector;

public class Venta {
	private int nroVenta;
	private LocalDate fecha;
	private float total;
	private Vector<ItemVenta> items;
    private static int proximoNumero;
	
	public Venta(LocalDate fecha, float total, Vector<ItemVenta> items) {
		this.nroVenta = proximoNumero;
		this.fecha = fecha;
		this.total = total;
		this.items = items;
	}
	
	public static int getProximoNumero()
    {
        return ++proximoNumero;
    }


	
	public int getNroVenta() {
		return nroVenta;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setNroVenta(int nroVenta) {
		this.nroVenta = nroVenta;
	}
	
	public void agregarItem(Producto p, int cant) {
		ItemVenta newItem = new ItemVenta(cant, p);
        items.add(newItem);
	}
	
	public float calcularTotal() {
		for (ItemVenta itemVenta : items) 
        {
            total= total + itemVenta.calcularSubtotal();
        }
        return total;
		
		
	}
	
	public void actualizarStock() {
		for (ItemVenta itemVenta : items) 
        {
			itemVenta.actualizarStock();
        }
		
	}
	public boolean sosLaVenta(int vta) 
	{
		return (vta==nroVenta);
	}

}