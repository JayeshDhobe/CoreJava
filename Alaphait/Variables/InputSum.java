package Variables;
//Sum of INTEGER
// import java.util.*;
// public class InputSum {
//     public static void main (String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {

//             int a =  sc.nextInt();
//             int b = sc.nextInt();
//             int sum  = a+b;
//             System.out.println(sum);

//        }
//        }
// }


//Product of INPUT
// import java.util.*;
// public class InputSum {
//     public static void main (String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {

//             int a =  sc.nextInt();
//             int b = sc.nextInt();
//             int product  = a * b;
//             System.out.println(product);

//        }
//        }
// }



//Area of CIRCLE
// import java.util.*;
// public class InputSum {
//     public static void main (String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//            double rad = sc.nextDouble();
//            double area = 3.14 * rad * rad;
//            System.out.println(area);
//        }
//        }
// }



//PRACTISE QUESTION---------------->>>>>>>>>



//Average of INPUT
// import java.util.*;
// public class InputSum {
//     public static void main (String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//           int a = sc.nextInt();
//           int b = sc.nextInt();
//           int c = sc.nextInt();

//           int average = a + b + c / 3 ;
//           System.out.println(average);
//        }
//        }
// }


//Side of square
// import java.util.*;
// public class InputSum {
//     public static void main (String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//           int a = sc.nextInt();
//           int side =  a*a;
//           System.out.println(side);
//        }
//        }
// }


//cost of 3 items from the user(usingfloatdatatype)
import java.util.*;
public class InputSum {
    public static void main (String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
          float Pencil = sc.nextInt();
          float Pen = sc.nextInt();
          float eraser = sc.nextInt();

          float total = Pencil + Pen + eraser ;
          System.out.println(total);

          // ADD ON 18% GST
          float GST = total + (0.18f * total);

          System.out.println("With gst added" + GST);

       }
       }
}