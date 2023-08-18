/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;
/**
 *
 * @author 507
 */
public class RepasoArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String flores[]= {"Crisantemo", "Loto", "Girasoles", "Loto", "Margaritas", "Orquideas"};
        
        System.out.println("El tamaño de array es " + flores.length);
        
        for(int j= 0; j< flores.length; j++) {
            
            System.out.println("La flor es: " + flores[j]);
            
        }
        
        //Podemos acceder a la posicion indicando la misma
        
        System.out.println("La flor en la posicion 0 es " + flores[0]);
        
        //Podemos definir un array y agregar elementos en las diferentes posciones.
        
        int tallas[]; //Esto es definir un array
        
        tallas = new int[7]; //Esto es declarar un array.
        
        int n ;
        
        System.out.println("El numero de tallas hombre es: ");
        
        n = sc.nextInt();
        
       int tallasHombre [] = new int[n]; //Define y declara el array.
       
        System.out.println("La longitud del array es: " + tallasHombre.length);
        
        tallasHombre [0]= sc.nextInt();
        tallasHombre [1]= sc.nextInt();
        tallasHombre [2]= sc.nextInt();
        tallasHombre [3]= sc.nextInt();
        tallasHombre [4]= sc.nextInt();
        
        for(int i=0; i< tallasHombre.length; i++){
            
            System.out.println("La talla " + i + "es: " + tallasHombre[i]);
        }
    }
}
