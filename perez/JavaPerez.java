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
public class JavaPerez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter word to check if it's a palindrome");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        char[] letters = word.toCharArray();
        String newWord = "";
        for(int i = (letters.length - 1); i >= 0; i--){
            newWord += letters[i];
        }
        if(word.toLowerCase().equals(newWord.toLowerCase())){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }
    }
    
}
