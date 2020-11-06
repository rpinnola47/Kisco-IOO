import java.util.Vector;
import java.time.LocalDate;
import java.util.Random;

public class ControladorVentas {
	//Attributes
	private Vector<VentaAlContado>ventasContado;
	private Vector<VentaTarjetaDebito>ventasDebito;
	private Vector<VentaTarjetaCredito>ventasCredito;
	private Vector<Venta>ventas;
	
	public ControladorVentas(Vector<VentaAlContado> ventasContado, Vector<VentaTarjetaDebito> ventasDebito,
			Vector<VentaTarjetaCredito> ventasCredito) 
	{
		this.ventasContado = ventasContado;
		this.ventasDebito = ventasDebito;
		this.ventasCredito = ventasCredito;
	}
	
	public int iniciarVenta()
	{
		
		Venta VentaN = new Venta(LocalDate.now(), 0, null);
        
        return Venta.getProximoNumero();
        
	}
	
	public boolean agregarProductoaVenta(int nroVenta, int codigoProducto, 
			int cantidad)
	{
        ControladorProducto mn = new ControladorProducto();

		Venta venta = buscarVenta(nroVenta);
        if (venta!=null)
        {
            Producto prod = mn.buscarProducto(codigoProducto);
            if(prod!=null)
            {
                venta.agregarItem(prod, cantidad);
            }
            return false;
        }
        return false;
	}
	
	public Venta buscarVenta(int nro)
	{
		for (Venta venta : ventas)
		{
			if (venta.sosLaVenta(nro))
				return venta;
		}
		return null;
		
	}
	
	public float cerrarVenta(int nroVta)
	{
		Venta venta = buscarVenta(nroVta);
		if (venta!=null)
		{
			//actualizar total
			venta.actualizarStock();
			//calcularTotal
			return venta.calcularTotal();
		}
		return 0;
	}
	
	public void emitirListadoVentasMesPorMedioDePago()
	{
		
	}
	
	public float cancelarVenta(int nroVta) 
	{
		return 20+30;
	}
}
