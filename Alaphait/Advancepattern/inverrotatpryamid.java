package Advancepattern;

public class inverrotatpryamid {
    public static void invertedprymid(int n) {
        for (int i = 1; i <=n; i++) {
            //spaces  4-1= 3 spaces  
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");  
            }
             //star
            for (int j2 = 1; j2 <=i; j2++) {
                    System.out.print("*");
            }             
            System.out.println();
        }
    }

 public static void main(String[] args) {
    invertedprymid(7);
}
}