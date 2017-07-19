//this program converts to piglatin by makking the first letter last and adding ay 
/*
 * this program is used to translate english words to piglatin and vice versa
 * the program reguest user input 
 * once user has input sentence they chooseto translate to either english
 * from pig latin or piglatin to english
 */

package assignment.perez;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class piglatinperez {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter your sentence");//used to prompt user input
        
        String sentence = input.nextLine();//input is of datatype string
        
        choose(sentence.toLowerCase());//method is called
        
   
    }
    
    //method translates english to piglatin and back
    private static void choose(String sentence){
        String[] words = sentence.split(" ");
        //the input is conerted to array with an identifier of words
        
        System.out.println("choose \n 1(english-piglatin) or \n 2(piglatin-english)");
        //this prompt user to choose to either translate to piglatin from english
        //or to english from pig latin
        
        int action = input.nextInt();
        //this represents the value for the choice made 
        // 1 translate english-piglatin while 2 translates  piglatin-english
        
        
        switch(action){
            case 1:
             //translate english to piglatin
                
                for(String word : words){
                 String newWord = word.substring(1)+word.substring(0,1)+ "ay";
                 //newWord is the variable of the word/sentence formed
                 //method substring(1) represent word_array from the second letter to the last
                 //substring(0,1) represents the first letter of the word_array
                 //so here the second letter to the last is concatinated with tha fisrt letter and ay 
                 
                 System.out.print(newWord + " ");
                }
                
            break;
            case 2:
               //translate  piglatin  to english
                 for(String word : words){
                 String newWord = word.substring(word.length()-3,word.length()-2) + word.substring(0,word.length()-3);
                 //here the third last letter of every word is concatinated with all the letters from index 0 to third last exclussive
                 System.out.print(newWord + " ");
                }
            break;
            
            default:
                System.out.println("invalid choice");
               choose(sentence); 
            break;
        }
                        
    
    }
    
}
