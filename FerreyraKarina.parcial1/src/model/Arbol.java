
package model;

import interfaces.Podable;


public class Arbol extends Planta implements Podable{
    private final double ALTURA_MAX;

    public Arbol(String nombre, String ubicacion, String clima, double ALTURA_MAX) {
        super(nombre, ubicacion, clima);
        this.ALTURA_MAX = ALTURA_MAX;
    }

    public double getALTURA_MAX() {
        return ALTURA_MAX;
    }

    
    @Override
    public String getNombre(){
        return nombre;
    }
   
    @Override
    public String toString() {
        return "Arbol{" + "ALTURA_MAX=" + ALTURA_MAX + '}';
    }

    

    @Override
    public void podar() {
        Podable.super.podar(); 
    }

   
    
    
}
