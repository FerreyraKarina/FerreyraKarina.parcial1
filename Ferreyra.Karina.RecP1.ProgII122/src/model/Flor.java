
package model;


public class Flor extends Planta{

    private Temporada temporada;
    
    public Flor(String nombre, String ubicacion, String clima, Temporada temporada) {
        super(nombre, ubicacion, clima);
        this.temporada = temporada;
        
    }

    

   
    public Temporada getTemporada() {
        return temporada;
    }

    @Override
    public String toString() {
        return "Flor{" + "temporada=" + temporada + '}';
    }

  
    
    
    
    

   

   
    
    
    

    
    
}
