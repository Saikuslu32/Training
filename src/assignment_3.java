public class assignment_3 {
    public static void main(String[] args) {
        int num=13;
        do
        {
            System.out.println(num + " is a prime number");
            num++;
        }
        while(num%2==1);

        if(num%2==1)
        {
            do
            {
                System.out.println(num+ " is NOT a prime number");
                num++;
            }
            while (num%2==0);
        }
    }
}
