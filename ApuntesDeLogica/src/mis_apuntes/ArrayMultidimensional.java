/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 507
 */
public class ArrayMultidimensional {
    
    public static void main(String[] args) {
        
        int [][] numeros = {{5, 2, 4}, {5, 8, 3}, {2, 4, 7}};
        
        System.out.println("El tamaño de la matriz es: " + numeros.length);
        
        //Para acceder a las condiciones indicamos la posicion en i y la posicion en j que es el array interno
        //Recordemos que la matriz la podemos definir como un array de arrays
        
        System.out.println("Posicion 0,2 es:" + numeros[0][2]);
        System.out.println("Posicion 2,1 es:" + numeros[2][1]);
        
        //Para recorrer la matrices usamos un for anidado: con el externo recorremos i
        //Con el interno, recorremos j
        
        for(int i=0; i <numeros.length; i++){
            for(int j=0; j<numeros[i].length; j++){
                
                System.out.print(numeros[i][j] + "\t");
                                               
            }
            System.out.println();
        }
    }
    
}
