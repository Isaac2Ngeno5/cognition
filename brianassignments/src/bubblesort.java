
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isaac
 */
public class bubblesort {
        
    public static void main(String[] args){
        int[] set = new int[10];
        Random rand = new Random();
        
        Scanner input = new Scanner(System.in);
        
         for (int i = 0; i < 10; i++){
            set[i] = rand.nextInt(100);
        }
        System.out.println("\nA randomly generated array to be used: " + Arrays.toString(set));
        
        System.out.println("enter 1(ascending) or 2(descending)");
        int numb = input.nextInt();
        
         switch(numb){
             case 1:
               
                System.out.println("\nA Ascending order array : " + Arrays.toString(bubblesortAs(set)));
                break;
                
            case 2:
                
                System.out.println("\nA Descending order array : " + Arrays.toString(bubblesortDe(set)));
                break;
                
            default:
                System.out.println("\n invalid choice");
                break;
        }
        
    }
    
    private static int[] bubblesortAs(int ar[]){
        for(int i=(ar.length-1);i>=0;i--){
            for(int j=1;j<=i;j++){
                if(ar[j-1]>ar[j]){
                    int temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return ar;
    }
    
     private static int[] bubblesortDe(int ar[]){
        for(int i=(ar.length-1);i>=0;i--){
            for(int j=1;j<=i;j++){
                if(ar[j-1]<ar[j]){
                    int temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return ar;
    }
    
}
