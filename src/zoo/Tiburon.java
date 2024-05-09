package zoo;

/**
 * Clase Tiburon que hereda de la clase Pez
 * @author Rubén Lozano
 * @version 1.0
 * @since 09/05/2024
 */
public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    /**
     * Constructor por defecto de la clase Tiburon
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /**
     * Constructor parametrizado de la clase Tiburon 
     * @param especie Define la especie del tiburón
     * @param peligroso Define el riesgo que conlleva el tiburón
     * @param velocidadMaxNatacion Define la velocidad máxima del tiburón
     * @param tipo Define el tipo del tiburón
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

    /**
     * Constructor parametrizado de la clase Tiburon
     * @param especie Define la especie del tiburón
     * @param peligroso Define el riesgo que conlleva el tiburón
     * @param velocidadMaxNatacion Define la velocidad máxima del tiburón
     * @param tipo Define el tipo del tiburón
     * @param habitat Define dónde vive el tiburón
     * @param comida Define la alimentación del tiburón
     * @param longevidad Define cuánto vive el tiburón
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /**
     * Método que indica la velocidad de desplazamiento del tiburón
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
     * Método que indica de lo que se alimenta el tiburón
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    /**
     * Método para finalizar la cuenta de tiburón
     * @throws Throwable Propaga la excepción
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
