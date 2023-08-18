/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author User
 */
public class Nomina_Pepito {
    
  // Pepito trabaja en la empresa xyz y hoy recibió su pago. Le descontaron un préstamo por 160.000 además de salud y pensión que son el 4% del salario base. 
//Además le pagaron el auxilio de transporte que son 140.606 Pepito quiere ver desglosado los descuentos y el pago en una planilla. 
//Imprima los detalles tomando en cuenta que pepito gana 1.250.000 de salario base.
    
    
    
    public static void main (String []args){
        
        
        int salario_base = 1250000;
        double porcentaje_dto_prestamo = 0.128;
        double porcentaje_dto_pensión = 0.04;
        double porcentaje_dto_salud = 0.04;
        int auxilio_tte = 140606;
        
        double Dto_Prestamo = (salario_base*porcentaje_dto_prestamo);
        double Dto_pensión = (salario_base*porcentaje_dto_pensión);
        double Dto_salud = (salario_base*porcentaje_dto_salud);
        
               
        System.out.println("Salario Base:" + salario_base);   
        System.out.println("Descuento Préstamo:" + Dto_Prestamo);
        System.out.println("Descuento Pensión:" + Dto_pensión);
        System.out.println("Descuento Salud:" + Dto_salud);
        
        double Nómina_Total = (salario_base)-(Dto_Prestamo+Dto_pensión+Dto_salud)+ auxilio_tte;
        
        System.out.println("Nomina Neto a pagar:"+Nómina_Total);
    }
    
}
