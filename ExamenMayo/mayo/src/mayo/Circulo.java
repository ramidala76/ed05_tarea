package mayo;

/** Trabajo de Examen Mayo - Virginia*/


public class Circulo {

    private double radio;
    private String color;
    private static int numCirculos;
    
    
    public double calculoArea(){
        if (this.getRadio()<0)
            throw new IllegalArgumentException("Radio negativo");
        return (Math.pow(getRadio(), 2)*Math.PI);
    }
    
    public double calculoPerimetro()throws Exception{
        if (this.getRadio()<0)
            throw new Exception ("Radio negativo");
        else if(getRadio()>=100)
            throw new Exception ("Radio muy grande");
        else 
            return (2*Math.PI*this.getRadio());
    }
    
    public boolean colorAceptable() throws Exception {
        if(getColor().length()>20){
            return false;
        }
        else{
            if(getColor().length()<=0){
                throw new Exception ("Color no existente");
            }
            return true;
        }       
    }
    
    /**Encapsulamos el atributo Radio con get y set*/
	private double getRadio() {
		return radio;
	}

	/**Encapsulamos el atributo Radio con get y set*/
	private void setRadio(double radio) {
		this.radio = radio;
	}
	
	/**Encapsulamos el atributo color con get y set*/
	private String getColor() {
			return color;
	}

	/**Encapsulamos el atributo Radio con get y set*/
	private void setColor(String color) {
		this.color = color;
	}
	
	/**Encapsulamos el atributo NumCirculos con get y set*/
	public static int getNumCirculos() {
		return numCirculos;
	}

	/**Encapsulamos el atributo Radio con get y set*/
	public static void setNumCirculos(int numCirculos) {
		Circulo.numCirculos = numCirculos;
	}
    

    
    
}