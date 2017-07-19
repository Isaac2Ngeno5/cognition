/*
 * write a program that checks whether a number is a cube or not
 */
package deccoassignments;

import java.util.Scanner;
/**
 *
 * @author Isaac
 */
public class perfectCube {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);//declare input
                
        System.out.println("enter number");//prompt user input
        double cube = input.nextDouble();//initialize user input

        System.out.println(isCube(cube));//call method 
        
    }
    //method to check if number is a perfect cube
    static boolean isCube(double cube){
    double cubeRoot = Math.cbrt(cube);
    return Math.round(cubeRoot) == cubeRoot;
    }
    
}
