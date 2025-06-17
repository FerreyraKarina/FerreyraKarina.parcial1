
package model;

import exceptions.PlantaDuplicadaException;


public class Botanico {

    public static void main(String[] args) {
        Jardin jardin = new Jardin();
        Arbol Roble = new Arbol("Roble","zona norte","templado",2.0);
        Arbol Roble2 = new Arbol("Roble","zona norte","templado",2.0);
        Arbusto ar = new Arbusto("tito", "zona este","soleado", 2);
        Flor f = new Flor("Jazmin", "zona sur", "soleado", Temporada.INVIERNO);
    
        try{
            jardin.agregarPlanta(Roble);
            jardin.agregarPlanta(Roble2);
            
            
        }catch(PlantaDuplicadaException e){
            System.out.println("Error " + e.getMessage());
        }
        jardin.agregarPlanta(ar);
        jardin.agregarPlanta(f);
        jardin.mostrarPlantas();
        jardin.podarPlantas();
    }
  }
    

