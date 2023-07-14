public class decimaltobinary {
    public static void dectobin(int n) {
      int myNum = n;
      int power1 = 0;
      int binNum1 = 0;
         
      while (n > 0) {
        int rem  = n % 2;
        binNum1 =  binNum1 + (rem * (int)Math.pow(10, power1));
        power1++;
        n = n/2;
      }
      System.out.println(myNum + "=  "+ binNum1);
    }



    public static void main(String[] args) {
        dectobin(5);
    }

}
//decimal to binary
// decimal  = decimal + lastdigit * power(1,10)

// base of power is 10  <--IMP--->