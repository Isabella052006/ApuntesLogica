/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class RaizCuadrada {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero a sacarle raiz cuadrada: ");
        int num = leer.nextInt();
               
        int raizC = raiz(num);
        
        if (raizC == -1){
            System.out.println("Raiz no encontrada o no existe en los numeros reales");
        }else{
           System.out.println("La raiz cuadrada de " + num + "es:" + raizC + " o " + (-1 * raizC));
        }
            
       
        
    }
    
    //Funcion para sacar la raiz cuadrada exacta entera de un numero
    public static int raiz(int num){
        int contador = 1;
        int raiz = 0;
        boolean salida = false;
        
        while (contador < num && salida == false){
            int resultado = (int) (num / contador);
            
            if (resultado == contador){
                raiz = resultado;
                salida = true;              
            }else {
                contador++;
                raiz= -1;
                salida = false;
            }
            
        }
        
        if(raiz != -1 && num >= 0){
            return raiz;           
            
        }
        return -1;
      
    
    }
}
    
    

