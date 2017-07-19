/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brianassignments;

/**
 *
 * @author Isaac
 */
import java.util.Arrays;
import java.util.Random;
public class Brianassignments {
    public static void main(String[] args) {
        int[] set = new int[10];
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++){
            set[i] = rand.nextInt(100);
        }
        System.out.println("\nA randomly generated array to be used: " + Arrays.toString(set));
        
        int sum = 0;
        
        for(int j=1;j<=10;j++){
          sum +=  set[j-1];
        }
        int average = sum/10;
        System.out.println(average);
    }
    
}
