import java.time.LocalDate;
import java.util.Vector;

public class VentaTarjetaDebito extends Venta {
	private int codigoVerificacion;
	private String emisor;
	private int numeroTarjeta;
	
	public VentaTarjetaDebito(int nroVenta, LocalDate fecha, float total, Vector<ItemVenta> items, int codigoVerificacion, String emisor,
			int numeroTarjeta) {
		super(fecha, total, items);
		this.codigoVerificacion = codigoVerificacion;
		this.emisor = emisor;
		this.numeroTarjeta = numeroTarjeta;
		
	}
	
	

}
