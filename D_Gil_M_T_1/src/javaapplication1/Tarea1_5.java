/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tarea1_5 {

   public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanf = new Scanner(System.in);
        int oportunidades=0;
        String texto="";
        String pass="";
         System.out.print("Introduzca su contrasena: ");
            pass = scanf.nextLine();
       while(texto.equals(pass)==false && oportunidades<=3)
        {   System.out.print("Introduzca el password : ");
            texto = scanf.nextLine();
            oportunidades++;
            if (texto.equals(pass)==false)
        System.out.print("password INCORRECTO!! ");
        else
            System.out.print("password CORRECTO!! ");
        }
        
    }
    
}