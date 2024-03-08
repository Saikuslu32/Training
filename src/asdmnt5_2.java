class Soul
{
    public void disp()
    {
        System.out.println("123");
    }
}

class Godlike extends Soul
{
    public void disp()
    {
        System.out.println("ABC");
    }
}

class spark extends Soul
{
    public void disp()
    {
        System.out.println("QWE");
    }

}

class OG extends Godlike
{
    public void disp()
    {
        System.out.println("BRAWL");
    }

}
public class asdmnt5_2 {

    public static void main(String args[])
    {

        OG obj = new OG();
        obj.disp();
    }
}

