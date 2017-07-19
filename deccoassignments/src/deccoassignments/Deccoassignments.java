/*
 * Write a Java method to check whether a string is a valid password.
 *  password rules:  -must have atleast ten characters
 *                                    -must consist of only letters and didgits
 *                                    -must contain atleast 2 digits
 */
package deccoassignments;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class Deccoassignments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter password");
        String password = input.nextLine();
        
        if(isValid(password)){
            System.out.println("valid password");
        }else{
            System.out.println("invallid password");
        }
    }
    
    public static boolean isValid(String password){
        if (password.length() < 10){
            return false;
        }else{
            char c;
            int count = 0;
            for (int i=0;i<password.length();i++){
                c = password.charAt(i);
                
                if(!Character.isLetterOrDigit(c)){
                    return false;
                }else if (Character.isDigit(c)){
                    count++;
                }
            }
            if (count < 2){
                return false;
            }
        }
        return true;
    }
}
