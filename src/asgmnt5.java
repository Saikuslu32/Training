class Mobile1{

    void refreshRate(){
        System.out.println("maximum in the market is : 144hz");
    }
}

class Motorola1 extends Mobile1{

    void model(){
        System.out.println(" MotoEdge 50 is new model which is available in ");
    }
}

class Colour1 extends Motorola1{

    void purple(){
        System.out.println("color purple ");
    }
}

class asgmnt5{

    public static void main(String args[]){

        Colour1 m = new Colour1();
        m.model();
        m.refreshRate();
        m.purple();

    }
}

