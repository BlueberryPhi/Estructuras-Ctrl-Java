/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class Tarea_1_1 {
    
    public static void main (String[] args) {

        Scanner scanner= new Scanner (System.in);
         System.out.println("Dame tu angulo en grados:");
         int grad = scanner.nextInt();
         
         if(grad==90)
             System.out.println("Tu angulo es recto");
         else if(grad>90)
             System.out.println("Tu angulo es obtuso");
         else if(grad<90)
             System.out.println("Tu angulo es agudo");
    }
}