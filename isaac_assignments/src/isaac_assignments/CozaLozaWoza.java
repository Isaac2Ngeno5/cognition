/*
 * Write a program called CozaLozaWoza which prints the numbers 1 to 110,
 * 11 numbers per line. The program shall print "Coza" in place of the numbers which are multiples of 3,
 * "Loza" for multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on.
 */
package isaac_assignments;

/**
 *
 * @author Isaac
 */
public class CozaLozaWoza {
    public static void main(String[] args){
        //int lowerbound = 1,upperbound = 110;
        for(int i = 1; i <= 110; i++){
            if(i%11==0){
                System.out.print("\n");
            }else if((i%3==0)&&(i%5==0)&&(i%7==0)){
             System.out.print(" cozalozawoza");
            }else if((i%3==0)&& (i%7==0)){
                System.out.print(" cozawoza");
            }else if((i%3==0)&&(i%5==0)){
                System.out.print(" cozaloza");
            }else if((i%5==0)){
                System.out.print(" loza");
            }else if((i%3==0)){
                System.out.print(" coza");
            }else if(!((i%3==0)&&(i%5==0)&&(i%7==0))){
                System.out.print(" "+i);
            }    
        }
    }
}
