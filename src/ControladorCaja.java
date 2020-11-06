import java.time.LocalDate;
import java.util.Vector;

public class ControladorCaja 
{
	//Attributes
	private String razonSocial;
	private String direccion;
	private int telefono;
	private String propietario;
	private LocalDate fechaInicioActividades;
	private Caja cajaActual;
	private Vector<Venta>listadoVentasMPVD;
	private static ControladorCaja instancia;
	
	//Constructor
	public ControladorCaja(String i, String j, int telefono, String k,
			LocalDate fechaInicioActividades) 
	{
		this.razonSocial = i;
		this.direccion = j;
		this.telefono = telefono;
		this.propietario = k;
		this.fechaInicioActividades = fechaInicioActividades;
		Vector<Caja>listadoVentasMPVD=new Vector<Caja>();
	}
	
	public ControladorCaja getContr()
	{
		if(instancia == null)
			instancia = new ControladorCaja(razonSocial, direccion, telefono, propietario, fechaInicioActividades);
		return instancia;
	}
	
	

	public void iniciarCaja(float saldo) 
	{
		Caja caja = new Caja(saldo, 0, 0, 0, null);
		caja.setSaldoInicial(saldo);
		cajaActual = caja;
	}
	
	public void sumarSaldoEfectivo(float saldoo) {
		float res=saldoo+ cajaActual.getSaldoEfectivo();
		cajaActual.setSaldoEfectivo(res);
	}
	public void sumarSaldoTC(float saldoo) {
		float res=saldoo+ cajaActual.getSaldoTarjetaCredito();
		cajaActual.setSaldoTarjetaCredito(res);
	}
	public void sumarSaldoTD(float saldoo) {
		float res=saldoo+ cajaActual.getSaldoTarjetaDebito();
		cajaActual.setSaldoTarjetaDebito(res);
	}
	
	
	public float cerrarCaja() 
	{
		float saldoDia = 
				cajaActual.getSaldoEfectivo() 
				+ cajaActual.getSaldoInicial()
				+ cajaActual.getSaldoTarjetaCredito()
				+ cajaActual.getSaldoTarjetaDebito();
		return saldoDia;
		
	}
	
	public void emitirListadoVentasMesPorVentaDiaria() 
	{ 
		for (Venta ventas : listadoVentasMPVD) 
        {
            System.out.println(ventas);
        }
	}
	
}
