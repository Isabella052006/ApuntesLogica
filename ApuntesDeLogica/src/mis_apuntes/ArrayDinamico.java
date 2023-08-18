/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 507
 */
public class ArrayDinamico {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        
        System.out.println("Ingrese nombre1: ");
        String name1 = sc.nextLine();
        names.add(name1);
        
        System.out.println("Ingrese nombre2: ");
        String name2 = sc.nextLine();
        names.add(name2);
        
        System.out.println("Ingrese nombre3: ");
        String name3 = sc.nextLine();
        names.add(name3);        
        
        
        
        System.out.println("Nombres " + names.toString());
        
        for(int i = 0; i< names.size(); i++){
            
            System.out.println("Nombre " + names.get(i));
            
            
        }
        
        
    }       
}
