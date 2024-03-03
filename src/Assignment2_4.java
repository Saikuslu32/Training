import java.util.Scanner;

public class Assignment2_4 {
    public static void main(String args[]) {
        Scanner sf = new Scanner(System.in);
        //1st question
        System.out.println("enter any number");
        int c=sf.nextInt();
        if(c>=75){
            System.out.println("your passed and your good score is:"+c);
        }
        else if(c>=35 && c<75){
            System.out.println(" your passed and your score is:"+c);
        }
        else{
            System.out.println("sry your failed");
        }
    }
}
