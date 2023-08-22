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
public class ExamenFinal3 {
     
        /*Los siguientes son los datos de 3  jugadores de futbol: Jugador 1, Juan, 
        “15 años”, delantero. Jugador 2: Pedro, “16 años” , defensa. Jugador 3: Luis , “17 años”, arquero.
        Cree una loop que imprima la información de los jugadores
        Indique la posición de arquero en el ejercicio anterior. Acceda al elemento.
        Indique la posición de “16 años”. Acceda al elemento.*/
    public static void main(String[] args) {
     
    Scanner leer = new Scanner(System.in);
int fila=0;
int colum=0;
int filas=0;
int colums=0;
        String[][] jugadores = {
            {"JUGADOR 1", "JUAN", "15 AÑOS", "DELANTERO"},
            {"JUGADOR 2", "PEDRO", "16 AÑOS", "DEFENSA"},
            {"JUGADOR 3", "LUIS", "17 AÑOS", "ARQUERO"}};
        System.out.println("El orden de los jugadores es: " + jugadores.length);

        for (int i = 0; i < jugadores.length; i++) {
            for (int j = 0; j < jugadores[i].length; j++) {
                System.out.print(jugadores[i][j] + "\t");
                        if(jugadores[i][j].equals("ARQUERO")){
                            fila= i;
                            colum=j;
                           
                        }
                        if(jugadores[i][j].equals("16 AÑOS")){
                              filas= i;
                              colums=j;
                        }
            }
            System.out.println("\t");
           

        }
 System.out.println("El jugador arquero esta en: " + fila +"," + colum);
  System.out.println("El jugador de 16 anos esta en: " + filas +"," + colums);
    }
}
           


