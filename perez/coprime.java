/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.perez;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class coprime {
    public static void main(String[] args){
        
      Scanner input = new Scanner(System.in);
      
      System.out.println("enter the first number");
      int a = input.nextInt();
      System.out.println("enter the second number");
      int b = input.nextInt();
      
     int max;
     
     if(a >= b){
         max = a;
     }else{
         max = b;
     }
     int count = 0;
     for(int i=2;i<=max;i++){
         if(a%i==0 && b%i==0){
             count++;
         }
     }
     if(count == 0){
         System.out.println("prime");
     }else{
         System.out.println("not prime");
     }
}
   
}
