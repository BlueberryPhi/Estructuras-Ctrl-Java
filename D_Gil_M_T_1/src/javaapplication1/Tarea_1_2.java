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
public class Tarea_1_2 {
    public static void main (String[] args) {

        Scanner scanner= new Scanner (System.in);
         System.out.println("Dame tu calificacion: ");
         int cali = scanner.nextInt();
         
         if(cali>=90&&cali<=100)
             System.out.println("Tu nota es A");
         else if(cali >= 80&&cali <= 90)
             System.out.println("Tu nota es B");
         else if(cali>=70&&cali<=80)
             System.out.println("Tu nota es C");
         else if(cali>=60&&cali<=70)
             System.out.println("Tu nota es D");
         else if(cali>=0&&cali<=60)
             System.out.println("Tu nota es F");
         else if(cali>100||cali<0)
             System.out.println("Tu calificacion esta fuera de este mundo. Dato invalido");
    }
    }
