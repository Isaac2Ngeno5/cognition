/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isaac_assignments;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class smallestOfThree {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }
    
    public static double smallest(double x, double y, double z)
    {
        //return Math.min(Math.min(x, y), z);
        double small = z;
        
        if((x<y)&&(y<z)) small = x;
        if((y<x)&&(y<z)) small = y;
        return 0;
    }
}
