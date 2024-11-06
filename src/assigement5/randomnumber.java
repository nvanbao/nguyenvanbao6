
package assigement5;

import java.util.Random;
import java.util.Scanner;
public class randomnumber {
    
    public static void main(String[] args) {
       Random random = new Random();
       Scanner scanner = new Scanner(System.in);
       int randomNumber= random.nextInt(50) +1;
       System.out.print("Doan so ngau nhien tu 1 den 50: ");
       int number = scanner.nextInt();
       while(number != randomNumber){
           if(number < randomNumber){
               System.out.println("Your number is lower!");
               int number1 = scanner.nextInt();
               number = number1;
           }else{
               System.out.println("Your number is higher!");
               int number2 = scanner.nextInt();
               number = number2;
           }
       }
       System.out.println("Your number is corect!");
    }
    
}
