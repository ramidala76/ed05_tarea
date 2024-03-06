/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class CCuenta {

    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
	/**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    public double estado(){
        return this.getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
		    throw new Exception(CCuenta.ERRORCANTIDADNEGATIVA);
		setSaldo(getSaldo() + cantidad);
    }

	public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
		    throw new Exception (CCuenta.ERRORCANTIDADNEGATIVA);
		if (getSaldo() < cantidad)
		    throw new Exception ("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
    }

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}


    
   