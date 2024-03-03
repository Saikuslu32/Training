import java.util.Scanner;

public class Assignment2_2{
        public static void main(String args[]) {
            Scanner sf = new Scanner(System.in);
            //1st question
            System.out.println("enter any number");
            int a = sf.nextInt();
            if (a > 50) {
                System.out.println(a);
            } else if (a >= 0 && a <= 50) {
                System.out.println(a);
            } else {
                System.out.println("its a negative value");
            }
        }

}
