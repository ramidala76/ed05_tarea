/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        double cantidadEsperada = 0;
        double cantidad = 0;
        
        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        

        probarIngresar(new ProbarIngresarParameter(objetoCuenta, cantidad));
        probarRetirar(new ProbarRetirarParameter(objetoCuenta, cantidad));
    
    }

	private static void probarRetirar(ProbarRetirarParameter cantidadEsperada) {
		try {
			cantidadEsperada.objetoCuenta.retirar(cantidadEsperada.cantidad);
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}

	private static void probarIngresar(ProbarIngresarParameter cantidadEsperada) {
		try {
			cantidadEsperada.objetoCuenta.ingresar(cantidadEsperada.cantidad);
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}
