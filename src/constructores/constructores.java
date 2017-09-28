package constructores;

/**
 *
 * @author josemanuxd
 */
public class constructores {
    public static void main(String[] args) {
        Persona personita = new Persona();
        personita = new Persona(20, "Jose");
        
        Cancion cancioncita = new Cancion();
        cancioncita = new Cancion(1, "Welcome to the Jungle");
        
        Ejercicio ejercicito = new Ejercicio();
        ejercicito = new Ejercicio(45, "Caminata");
        
        Comida comidita = new Comida();
        comidita = new Comida(4, "Pozole");
        
        BuevitoConCatsun buevito = new BuevitoConCatsun();
        buevito = new BuevitoConCatsun(20, "Jose");
        
        
    }
    
}
