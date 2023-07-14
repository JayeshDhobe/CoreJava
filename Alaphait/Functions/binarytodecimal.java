public class binarytodecimal {
    public static void bintodec(int BinNum) {
        int myNum = BinNum;
        int power = 0;
        int decNum = 0;
        while (BinNum > 0 ) {
            int lastdigit = BinNum % 10;
            decNum =  decNum + (lastdigit * (int)Math.pow(2, power));
            power++;
            BinNum = BinNum/10;
        }
        System.out.println("decimal of binary " + myNum + " = " + decNum );
    }
     public static void main(String[] args) {
        bintodec(101);
    }

}

//binary to decimal
// decimal  = decimal + lastdigit * power(1,2)
// base of power is 2  <--IMP--->

