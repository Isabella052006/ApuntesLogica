/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenLogica;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class ExamenFinal2 {
    
    public static void main(String[] args) {
        
        /*Cree una matriz  3 * 3 en la que almacene las edades de sus familiares 
          mas allegados. Cree un loop que recorra e imprima la matriz.*/

        Scanner leer = new Scanner(System.in);
        
        double[][]familia = {
            {(1.27),(1.16),(1.55)},
                {(1.32),(1.17),(1.23)},
                        {(1.1),(1.59),(1.37)}};
        System.out.println("El tamano de la matriz es: "+familia.length);
        
         for(int i=0;i<familia.length;i++){
            for(int j=0;j<familia[i].length;j++){
                System.out.println(familia[i][j] +"\t \n");
                
  
    }
}
        
    }
    
}
