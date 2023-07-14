package Loops.Dowhileloop;

import java.util.*;

public class exceptmultiple10 {
    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)) {
           do {
            System.out.print("Enter your number:");
             int n = sc.nextInt();

             if (n  % 10 ==0) {
                continue;
             }
            System.out.println("number is:" +n);
               
           } while (true);
        }
    }
}
