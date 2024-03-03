import java.util.*;
public class Assignment2_1 {
    public static void main(String args[]){
        Scanner sf=new Scanner(System.in);
        //1st question
        System.out.println("enter any number");
        int a=sf.nextInt();
        if(a>=0){
            System.out.println(a);
        }
        else{
            System.out.println(a);
        }
        //2nd question
        System.out.println("enter any number we give u a output if its a even number");
        int b=sf.nextInt();
        if(b%2==0){
            System.out.println("its a even number "+b);
        }
        else{
            System.out.println("its a odd number "+b);
        }
        //3rd question
        System.out.println("enter the marks that u got, we will give you a result.if your passed");
        int c=sf.nextInt();
        if(c>=35){
            System.out.println("your passed and your score is:"+c);
        }
        else{
            System.out.println("sry your failed and your score is:"+c);
        }
    }
}
