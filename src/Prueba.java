
import java.util.Vector;

public class Prueba {

	public static void main(String[] args) 
    {
        Prueba kiosco = new Prueba();
        kiosco.iniciarKiosco();
        
    }
    
    public void iniciarKiosco()
    {
        //inicio el kiosquito
        ControladorProducto contrprod = new ControladorProducto();
        ControladorCaja contrcaja = new ControladorCaja("LOS HERMANOS", "Saenz peña 1030" ,43056678, null, null);
        ControladorVentas contrventas = new ControladorVentas(null, null, null);
        contrprod.crearProducto(0, "caca de perro", 5, 12, 1, "alimentos");
        contrprod.crearProducto(2, "cofler block", 500, 20, 10, "chocolates");
        contrprod.eliminarProducto(0);
        contrcaja.iniciarCaja(500);
        contrcaja.sumarSaldoEfectivo(300);
        contrcaja.sumarSaldoEfectivo(200);
        contrcaja.sumarSaldoTC(3000);
        System.out.println(contrcaja.cerrarCaja());
        
 
                
        
      
    }

}
