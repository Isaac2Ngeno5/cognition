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
public class piglatin {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String sentence = "";
        do{
            String[] words;
            System.out.print("Enter your words here: ");
            sentence = input.nextLine();
            words = sentence.split("");
            for(String word : words){
                if(word.startsWith("a") || word.startsWith("e") || 
                        word.startsWith("i") || word.startsWith("o") || word.startsWith("u")){
                    System.out.println(word + "way");
                }else if(word.startsWith("sh") || word.startsWith("th")){
                System.out.println(word.substring(2));
            }else{
                    System.out.println(word.substring(1));
                    }
            }
            System.out.println();
        }while(!sentence.equals("quit"));
    }
    
}
