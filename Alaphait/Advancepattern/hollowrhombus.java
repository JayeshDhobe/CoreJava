package Advancepattern;

public class hollowrhombus {
    public static void rhomholl(int n ,int m) {
        for (int i = 1; i <=n; i++) {
            

            //space for rhombus
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }
            

            //start
            for (int j = 1; j <=5; j++) {
                if (i == 1 || j == 1 || i == n|| j == n) {
                    System.out.print("*");
                }else{
                System.out.print(" ");     
            }   
            }
            System.out.println();
        }
            
        }
        public static void main(String[]  args) {
            rhomholl(5, 5);
        }
}
