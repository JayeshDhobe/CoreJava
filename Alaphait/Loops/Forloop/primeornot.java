package Loops.Forloop;
import java.util.Scanner;

public class primeornot {
   public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
         
        if (n == 2) {
            System.out.println("number is prime");
        } 
        else{
            boolean isPrime = true ;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i ==0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("number is prime");
        } else{
            System.out.println("number is not prime");
    }
        }
       
        
    }
   }
}