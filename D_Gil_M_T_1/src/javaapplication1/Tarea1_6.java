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
public class Tarea1_6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("*****  Valores pares dentro de un rango *** ");
        System.out.println("Introduce limite inferior: ");
        int limInf=scan.nextInt();
         System.out.println("Introduce limite superior: ");
        int limSup=scan.nextInt();
        int ConPar=0, ContImpar=0;
        for(int i=limInf; i<=limSup; i++)
            if(i%2==0)
                ConPar++;
            else ContImpar++;
               
         System.out.println("Total de valores pares "+ConPar);
         System.out.println("Total de valores impares "+ContImpar);
    }
    
}