
import java.util.ArrayList;
import java.util.List;
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
public class emailmanenos {
   public static void main(String[] args){
       //EmailDetails mail = new EmailDetails("john","johndoe@gmail.com");
       
       //mail.name = "john";
       //mail.email = "johndoe@gmail.com";
       
       //List details = new ArrayList();
       //details.add("brio");
       //details.get(0);
       
       Scanner mail = new Scanner(System.in);
       
       List<EmailDetails> bulldog = new ArrayList<>();
       
       String name;
       String email;
       
       while(true){
           System.out.println("enter name ");
           name = mail.nextLine();
           if(name.equalsIgnoreCase("stop")){
            break;
           }else{
            System.out.println("enter email");
            email = mail.nextLine();
            if(email.equalsIgnoreCase("stop")){
             break;
             
            }else{
                if(!email.substring(email.length()-2).equalsIgnoreCase("us") && !email.substring(email.length()-2).equalsIgnoreCase("uk")){
                   bulldog.add(new EmailDetails(name,email));  
                }
            }
            
           }
         }
       
       for(EmailDetails brio: bulldog){
           System.out.println(brio.name + " -> " + brio.email);
       }
       
       
       
       
} 
   
    
}
class EmailDetails{
       String name;
       String email;
       
    //constructor
       EmailDetails(){
           
       }
       //method overloading
        EmailDetails(String name,String email){
           this.name = name;
           this.email = email;
       }

   }