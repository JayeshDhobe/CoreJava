public class Invertedstart {
     public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    }


    // start = n-i+1

    // if line no 2      ==    i.e = 4-2+1=3
    //4available star   