import java.util.Vector;

public class Caja 
{
	//Atributos
	private float saldoInicial;
	private float saldoEfectivo;
	private float saldoTarjetaDebito;
	private float saldoTarjetaCredito;
	private Vector<Venta> ventasDia;
	
	
	
	public Caja(float saldoInicial, float saldoEfectivo, float saldoTarjetaDebito, float saldoTarjetaCredito,
			Vector<Venta> ventasDia) 
	{
		this.saldoInicial = saldoInicial;
		this.saldoEfectivo = saldoEfectivo;
		this.saldoTarjetaDebito = saldoTarjetaDebito;
		this.saldoTarjetaCredito = saldoTarjetaCredito;
		this.ventasDia = ventasDia;
	}
	
	
	public float getSaldoInicial() {
		return saldoInicial;
	}


	public void setSaldoInicial(float saldoInicial) {
		this.saldoInicial = saldoInicial;
	}


	public float getSaldoEfectivo() {
		return saldoEfectivo;
	}


	public void setSaldoEfectivo(float saldoEfectivo) {
		this.saldoEfectivo = saldoEfectivo;
	}


	public float getSaldoTarjetaDebito() {
		return saldoTarjetaDebito;
	}


	public void setSaldoTarjetaDebito(float saldoTarjetaDebito) {
		this.saldoTarjetaDebito = saldoTarjetaDebito;
	}


	public float getSaldoTarjetaCredito() {
		return saldoTarjetaCredito;
	}


	public void setSaldoTarjetaCredito(float saldoTarjetaCredito) {
		this.saldoTarjetaCredito = saldoTarjetaCredito;
	}


	public Vector<Venta> getVentasDia() {
		return ventasDia;
	}


	public void setVentasDia(Vector<Venta> ventasDia) {
		this.ventasDia = ventasDia;
	}

}
