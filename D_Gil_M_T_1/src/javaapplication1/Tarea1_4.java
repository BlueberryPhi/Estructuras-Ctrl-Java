/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Tarea1_4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int numero, contador=0;
        boolean flag=false;
        System.out.print("Introduce un valor numérico: ");
        numero=scan.nextInt();
        while(numero !=0)
        {
            numero = numero/10;
            contador++;
        }
        System.out.println("El numero de digitos es: "+contador);
    }
    
}
