import java.util.Scanner;

public class Assignment2_3 {
    public static void main(String args[]) {
        Scanner sf = new Scanner(System.in);
        //1st question
        System.out.println("enter any number");
        int a = sf.nextInt();
        if (a%2==0) {
            System.out.println("its a even number");
        } else if (a%2!=0) {
            System.out.println("its a odd number");
        } else {
            System.out.println("its not a valid number");
        }
    }
}
