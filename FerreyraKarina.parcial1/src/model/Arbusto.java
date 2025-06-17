
package model;

import interfaces.Podable;


public class Arbusto extends Planta implements Podable{
    private final int DENSIDAD_MAX = 10;
    private final int DENSIDAD_MIN = 1;
    private int densidadFollaje;

    public Arbusto(String nombre, String ubicacion, String clima, int densidadFollaje) {
        super(nombre, ubicacion, clima);
        this.densidadFollaje = densidadFollaje;
    }

    public int getDENSIDAD_MAX() {
        return DENSIDAD_MAX;
    }

    public int getDENSIDAD_MIN() {
        return DENSIDAD_MIN;
    }

    public int getDensidadFollaje() {
        return densidadFollaje;
    }
    
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    


    @Override
    public String toString() {
        return "Arbusto{" + "DENSIDAD_MAX=" + DENSIDAD_MAX + ", DENSIDAD_MIN=" + DENSIDAD_MIN + ", densidadFollaje=" + densidadFollaje + '}';
    }

  
    
    
    
    @Override
    public void podar() {
        Podable.super.podar(); 
    }


   
    
    
    
}
