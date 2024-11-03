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
public class Tarea1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Dame numero de asteriscos maximo(preferiblemente 5): ");
         int k = scan.nextInt();
        
        
       for(i=1;i<=k;i++){
           for(j=1;j<=i;j++){
        System.out.print("*");}
       
        System.out.println(" ");  
       }
       for(i=k-1;i>=1;i--){
       for(j=1;j<=i;j++){
           System.out.print("*");}
       
       System.out.println(" ");  }
    }
    
}
