/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author 507
 */
public class Calculadora2 {
     static Scanner sc = new Scanner (System.in);
    
    public static void main (String [] args){
        
            
        menuCalc(1);
    }
    
    public static void menuCalc(int ison){
        
        System.out.println("--------------------");
        System.out.println("Calculadora personal");
        System.out.println("--------------------");
        System.out.println("1. Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Modulo\n6.Salir ");
        System.out.println("--------------------");
        
        int is0n;
        System.out.println("Oprima 1 para encender la calculadora");
        int isOn = sc.nextInt();
         while(isOn!=0){
            
            System.out.println("--------------------");
        System.out.println("Calculadora personal");
        System.out.println("--------------------");
        System.out.println("1. Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Modulo\n6.Salir ");
        System.out.println("--------------------");
            
 System.out.println("Ingrese una opcion");
        int opc = sc.nextInt();
        switch(opc){
            case 1: 
                System.out.println("1. Sumar\n");
                double num1 = capturarDatos("Ingrese el numero 1:");
                double num2 = capturarDatos("Ingrese el numero 2:");
                System.out.println("El resultado de la suma es:  " + sumar (num1,num2));
                break;
            case 2:
                System.out.println("2. Restar\n");
                double num3 = capturarDatos("Ingrese el numero 1:");
                double num4 = capturarDatos("Ingrese el numero 2:");
                System.out.println("El resultado de la resta es:  " + restar (num3,num4));
                break;
            case 3:
                System.out.println("3. Multiplicar\n");
                double num5 = capturarDatos("Ingrese el numero 1:");
                double num6 = capturarDatos("Ingrese el numero 2:");
                System.out.println("El resultado de la multiplicacion es:  " + multiplicar (num5,num6));
                break;
            case 4:
                System.out.println("4. Dividir\n");
                double num7 = capturarDatos("Ingrese el numero 1:");
                double num8 = capturarDatos("Ingrese el numero 2:");
                System.out.println("El resultado de la division es:  " + dividir (num7,num8));
                break;
            case 5:
                System.out.println("5. Modulo\n");
                double num9 = capturarDatos("Ingrese el numero 1:");
                double num10 = capturarDatos("Ingrese el numero 2:");
                System.out.println("El resultado de la potencia es:  " + modulo (num9,num10));
                break;
            case 6:
                System.out.println("6. Salir\n");
                isOn=  0;
                break;
            default:
            System.out.println("Ingrese una opcion valida");
            
                          
                
          
        }
        
        }
    
    }
    
    public static double capturarDatos (String cadena){
        System.out.println(cadena);
        double num= sc.nextDouble();
        return num;
    
    }
    
    public static double sumar(double num1, double num2){
        
        double suma = num1 + num2;
        
        return suma;
    
    }
    
    
    public static double restar(double num1, double num2){
        
        double resta = num1 - num2;
        
        return resta;              
        
    }
    
    public static double multiplicar(double num1, double num2){
        
        double multi = num1 * num2;
        
        return multi;
        
    }
    
    public static double dividir(double num1, double num2){
        
        double dividir = num1 / num2;
        
        return dividir;
    }
    
     public static double modulo(double num1, double num2){
        
        double mod = num1 / num2;
        
        return mod;
    
}
}
    

