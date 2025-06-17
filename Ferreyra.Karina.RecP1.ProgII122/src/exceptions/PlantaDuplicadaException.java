
package exceptions;


public class PlantaDuplicadaException extends RuntimeException{
    public PlantaDuplicadaException() {
        super("Esa planta ya fue registrada");
    }
    
    public PlantaDuplicadaException(String mensaje){
        super(mensaje);
    }
    
}
