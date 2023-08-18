/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Lenovo
 */
public class Ejercicios2 {
    
    public static void main(String [] args){
    
        //Si Pepito tiene menos de 2800 en la civica
        
        double pasaje = 2900;
        
        if (pasaje <2800){
        
        System.out.println("saldo insuficiente");
        
        
        
        }else{
            
            double saldo = pasaje - 2800;
            
            System.out.println("Su nuevo saldo:" + saldo);
            
        }
        
        
        //Si Juan saco 2.9 en el examen de logica
        
        double nota = 2.9;
        
        if(nota < 3.0){
            
            System.out.println("Perdio examen");
            
        }else{
            
            System.out.println("Gano examen");
        }
        
        
        //Si Andres es 3 cm mas alto que Juan
        
        double alturaJ = 1.67;
        
        if(alturaJ<= 1.70){
            
            System.out.println("Mas alto que Juan");
        }else{
            
            System.out.println("Mas bajo que Juan");
        }
        
        
        //Si tengo el fin de semana libre
        
        String pregunta ="no";
        
        if(pregunta== "si"){
            
            System.out.println("no tengo el dia libre");
        }else{
            
            System.out.println("tengo el dia libre");
        }
            
        //Si me invitan a una fiesta
        
        String puedeir = "si";
        
        if(puedeir=="no"){
            
            System.out.println("si voy a ir");
        }else{
            
            System.out.println("no voy a ir");
        }
               
        //Si quiero pizza o helado
    
        double presupuesto =30000;
                
                if(presupuesto <40000){
                    
                    System.out.println("Pizza");
                    
                }else{
    
             System.out.println("Helado");
                }
    }
    
}
