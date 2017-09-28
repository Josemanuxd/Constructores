package constructores;

/**
 *
 * @author josemanuxd
 */
public class Comida {
    
    int cantidad;
    String platillo;
    
    public Comida(){}
    
    public void preparar(){}
    public void servir(){}
    public void ingerir(){}
    
    public Comida(int cant, String plat){
        this.cantidad = cant;
        this.platillo = plat;
    }
    
}
