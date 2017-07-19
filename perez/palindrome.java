/*
 * the program checks whether a word is a palindrome
 */
package assignment.perez;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class palindrome {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");//prompt user input
        
        String word = input.nextLine();
        //input stored in word as a string
        
        char[] text = word.toCharArray();//converts string word to array(text)
        String letters="";
        //variable formed by concatinating the inverse of letters of the array text
        
        for(int i=text.length-1;i>=0;i--){
          letters+=text[i];
          //inverse of letters in text is concatinated and stored in letters
                   }//end of loop
        
        if(word.equals(letters)){//compares the word with its inverse 
            System.out.println("is palindrome");
        }else{
         System.out.println("is not a palindrome");
        }
            

    }
    
}
