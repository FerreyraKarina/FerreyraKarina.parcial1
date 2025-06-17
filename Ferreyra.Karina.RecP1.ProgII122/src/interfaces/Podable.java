/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;


public interface Podable {
    
    public String getNombre();
    
    default void podar(){
        System.out.println("Podando : "+ getNombre() );
    }

    

  

    
}
