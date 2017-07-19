/*
 * Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n),
 * where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average.
 */
package isaac_assignments;

/**
 *
 * @author Isaac
 */
public class Fibonacci {
    public static void main(String[] args){
        int sum = 0;
        double average = 1;
       for(int i = 0;i<20;i++){
         sum += fibonacci(i);
         average = sum/20;
         
         System.out.print(" "+fibonacci(i));
       }
       System.out.println("\n"+average);
    }
    private static int fibonacci(int n){
        if(n <= 2){
        return 1;
        }else{
          return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
}
