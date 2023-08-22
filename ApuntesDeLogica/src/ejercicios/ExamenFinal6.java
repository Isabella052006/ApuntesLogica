/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class ExamenFinal6 {
    
    public static void main(String[] args) {
        /*Empleando do- while, cree una funcionalidad que muestre permita agregar de
        manera continua 7 números a una lista y salga de la misma al finalizar. 
        Del ejercicio anterior cree un loop que recorra la lista e imprima los elementos.*/
        
        
        Scanner sc = new Scanner (System.in);
      int [] numerosArray = new int [7];
    
    int contar = 0;
    
    
        System.out.println("entrar 7 numeros"); 
    
    do{
      if (contar >= numerosArray.length){
          System.out.println("lista");
          break;
          
          
          
          
      }  
        System.out.println("entre a numeros");
        int numeros = sc.nextInt();
        numerosArray[contar]= numeros;
        
        contar++;
    } while (true);
    
        System.out.println("entrar a numeros");
    //for (int num : numerosArray)//
    for (int i =0; i< contar;i++)
    {
        
        System.out.println(numerosArray [i]);
        
        
        
    }
    
        
        
        
    }
    
}
