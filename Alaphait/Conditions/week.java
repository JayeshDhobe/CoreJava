package Conditions;
import java.util.*;;
public class week {
    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int week = sc.nextInt();

            switch (week){
                case 1: System.out.println("monday");break;
                case 2: System.out.println("tuesdaay");break;
                case 3: System.out.println("wednesday");break;
                case 4: System.out.println("thusday");break;
                case 5: System.out.println("fridy");break;
                case 6: System.out.println("satuarday");break;
                case 7: System.out.println("sunday");break;
                default : System.out.println("Invalid");

            }
        }
    }
}
