/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class OperadorAritmetico {
    //a. sacar el promedio de puntos  
    //b. por sanción perdió 50 puntos los días martes y miércoles 
    //c. Le van a pagar por cada 50 puntos una bonificación de 10.000 los días lunes, martes y miércoles y de 15.000 los dias jueves y viernes
    //d. Cuánto dinero recibe por bonificación en total y cuánto dejó de ganar por la sanción
    //e. deberá imprimir un informe
    
    
    
    public static void main (String []args){
        
     //Variables
          
     int a, b, c, d, e; 
       a = 500;
       b = 400;
       c = 390;
       d = 510;
       e = 300;
      
    // int lunes, martes, miercoles, jueves, viernes;
         
                //lunes = 10000
                //martes = 10000
                //miercoles =10000
               // jueves = 15000
                //viernes = 15000
          
       
               
     
     //a. //Promedio
     
     int promedio = (a + b + c + d + e)/ 5; // Jerarquia de operadores (9, */,+-
     
     int suma = (a + b + c + d + e);
     
    System.out.println("El promedio de puntos" + promedio);     
    System.out.println("Suma puntos antes de la sanción" + suma); 
    
    //b. //sancion 
     
     int sanción = 50;
     int bSinSanción = b;
     int cSinSanción =c;
    int bConSanción = b - sanción;
    int cConSanción = c - sanción;
    
      System.out.println("valor de b antes de la resta" + b);
    b = b - sanción;
    // b-= sanción;
    c-= sanción; //esto es la manera corta de haceruna resta con la misma 
        
     //System.out.println("ver b: " + bConSanción)+ " ver c: "+ cConSanción);
     System.out.println("valor de b antes de la resta" + b);
     
     
     //c. //bonificación 
     System.out.println(b);
     System.out.println(c);
     int PagoBono10 = ((a+b+c)/50)* 10000;
     int PagoBono15 = ((d+e)/50) *15000;
     
     int bonoTotal= PagoBono10 + PagoBono15;
     
     //cuánto dejó e percibir
     
     int pérdida = (((bSinSanción -b)+ (cSinSanción - c))/50) *10000;
        System.out.println("La pérdida es de: "+ pérdida);
     
     
     
   
     
    
     
     
             
     
     
     
     
 }   
}
