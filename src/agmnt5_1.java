import javax.lang.model.type.ErrorType;

class Sai{
    void msg()
    {
        System.out.println("Hello");
    }
}
class Kuslu{
    void msg(){
        System.out.println("Welcome");
    }
}
class Gullapalli extends Sai,Kuslu { //ERROR

      void msg() {
          System.out.println("Got you!");

    }
}
public class agmnt5_1 {
    public static void main(String args[]) {
        Gullapalli obj = new Gullapalli();
        obj.msg();


    }
}
