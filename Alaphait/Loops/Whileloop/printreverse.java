package Loops.Whileloop;

public class printreverse {
    public static void main (String args[]){
     int n = 10899;

     while (n > 0) {
        int lastdigit = n % 10; // if divide by 10 then remainder is always last number of given digit 
        System.out.print(lastdigit);

        n = n/10; //to shorter the given number
     }
     System.out.println();

    }
}
