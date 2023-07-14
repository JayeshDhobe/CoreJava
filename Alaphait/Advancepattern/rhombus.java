package Advancepattern;

public class rhombus {
    public static void rhom(int n) {
        for (int i = 1; i <=n; i++) {
            

            //space
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }
            

            //start
            for (int j = 1; j <=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            
        }
        public static void main(String[]  args) {
            rhom(5);
        }
    }

