/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1;

/**
 *
 * @author PC-19
 */
public class Auto {
    
    String marca;
    int año;
    String placa;
    String modelo;
    String nombrePropietario;
    
      public String mostrarInfo(){
        
       var retorno="El auto tiene placa; " + this.placa + " es de marca: " 
               + this.marca ;
        
        
        return retorno; 
        
    }
    
    public String getPaisMarca(){
        var retorno = "";
        
    if (this.marca.equals("Chevrolet")) {
            retorno = "EE.UU";
        } else {
        
            if (this.marca.equals("Toyota")) {
                retorno = "Japon";
            } else {
                
                if (this.marca.equals("Jetour")) {
                    retorno = "China";
                    
            } else {
                    if (this.marca.equals("Mercedes Benz")) {
                    retorno = "Alemania";
                
            } else {
                    retorno = "No definido";
            }
        
     }
                
            
   }
    
   }
    
    
 
   

   
    return retorno;
    }
        

}
