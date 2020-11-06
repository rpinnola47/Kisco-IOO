import java.time.LocalDate;
import java.util.Vector;

public class VentaAlContado extends Venta {
	
	public VentaAlContado(int nroVenta, LocalDate fecha, float total, Vector<ItemVenta> items) {
		super(fecha, total, items);
		
		
	}
}
