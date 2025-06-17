
package model;

import exceptions.PlantaDuplicadaException;
import interfaces.Podable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Jardin {
    private Set<Planta> plantas;

    public Jardin() {
       plantas = new HashSet<>();
    }
    
  
    
    public void agregarPlanta(Planta p) throws PlantaDuplicadaException{
       
        if (!plantas.add(p)) {
            throw new PlantaDuplicadaException();
        }else{
            System.out.println("Planta agregada "+ p.getNombre());
        }
    }
    
    public void mostrarPlantas(){
        if (plantas.isEmpty()) {
            System.out.println("No hay plantas en el jardin");
        }else{
            for (Planta p : plantas) {
                System.out.println("Nombre: "+ p.getNombre());
                System.out.println("Ubicacion: "+ p.getUbicacion());
                System.out.println("Clima: "+ p.getClima());
                
                
                if (p instanceof Arbol) {
                    Arbol a = (Arbol) p;
                    System.out.println("Altura maxima: "+ a.getALTURA_MAX());
                }else if (p instanceof Arbusto) {
                    Arbusto arb = (Arbusto) p;
                    System.out.println("Densidad de follaje: "+ arb.getDensidadFollaje());
                }else if (p instanceof Flor) {
                    Flor f = (Flor) p;
                    System.out.println("Temporada de florecimiento: " + f.getTemporada());
                }
            }
            
            
            
    }
    
    
}
  
    
    
    public void podarPlantas(){
        for(Planta p : plantas){
            if (p instanceof Podable) {
                ((Podable) p).podar();
            }else{
                System.out.println("La planta "+ p.getNombre() + "no se puede podar");
            }
        }
    }
    
    
    
}
