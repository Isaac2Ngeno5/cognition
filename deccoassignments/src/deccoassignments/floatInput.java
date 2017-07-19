/*
 * Write a program to accept a float value of a number and return a rounded float value.
 */
package deccoassignments;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class floatInput {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
      Scanner input = new Scanner(System.in); 
      System.out.println("enter a float value");
      float val = input.nextFloat();
      
      System.out.println("the rounded float = " + roundNum(val));
     
    }
    
    public static float roundNum(float val){
        float fNum = (float)Math.floor(val);
        float cNum = (float)Math.ceil(val);
        
        if((val-fNum)>(cNum-val)){
            return cNum;
        }else if((cNum-val)>(val-fNum)){
            return fNum;
        }else{
            return cNum;
        }
    }
    
}
