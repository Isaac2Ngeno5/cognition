/*
 * Write a program to check if a number is Armstrong or not
*/
package deccoassignments;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class armstongNumber {
    public static void main(String[] args){
        int count = 0;
        int n, a, b, c;
        int sum =0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter a number");
        n = input.nextInt();
        a = n;
        c = n;
        
        while(a > 0){
            a = a/10;
            count++;
        }
        while(n > 0){
            b = n%10;
            sum = (int)(sum+Math.pow(b, count));
            n = n/10;
        }
        if(sum == c){
            System.out.println("Given number is armstrong");
        }else{
            System.out.println("number given is not armstrong");
        }
    }
}
