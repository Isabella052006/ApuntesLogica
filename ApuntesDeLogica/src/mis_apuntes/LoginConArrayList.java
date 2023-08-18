/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;
import java.util.Scanner;

import java.util.ArrayList;

/**
 *
 * @author 507
 */
public class LoginConArrayList {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usuario=new ArrayList<String>();
        
        //Crear un registro:
        
        System.out.println("Ingrese su nombre: ");
        String name =sc.nextLine();
        usuario.add(name);
        System.out.println("Ingrese su correo: ");
        String email = sc.next();
        usuario.add(email);
        System.out.println("Ingrese su password: ");
        String passw = sc.next();
        usuario.add(passw);
        
        
        System.out.println("Iniciar sesion: ");
        System.out.println("Ingrese el correo registrado: ");
        String emailUser = sc.next();
        System.out.println("Ingrese la contraseña registrada");
        String passwUser = sc.next();
        
        if(usuario.get(1).equals(emailUser) && usuario.get(2).equals(passwUser)){
            System.out.println("Bienvenido" + usuario.get(0));
        }else{
            System.out.println("Valide sus credenciales");
        }
              
    }
    
}
