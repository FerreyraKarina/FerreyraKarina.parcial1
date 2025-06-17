
package model;

import java.util.Objects;


public abstract class Planta {
    protected String nombre;
    protected String ubicacion;
    protected String clima;

    public Planta(String nombre, String ubicacion, String clima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }
    
    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getClima() {
        return clima;
    }

    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", clima=" + clima + '}';
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass())return false; 
        final Planta p =(Planta) obj;
        return Objects.equals(this.nombre, p.nombre)
        && Objects.equals(this.ubicacion, p.ubicacion)
                && Objects.equals(this.clima, p.clima);
        
            
        
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(nombre, ubicacion, clima);
    }
    
    
    
    
}