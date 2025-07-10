package masteryws;

public class interfaces {

    public static void main(String[] args)
    {
        Flyable[] flyers = new Flyable[2];
        flyers[0] = new bird();
        flyers[1] = new plane();

        for (Flyable f : flyers){
            f.fly();
        }
    }
}

interface Flyable{
    void fly();
}

// keyword for interface extension in another class : implements
class bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird flies by flapping its wings.");
    }
}

class plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Aeroplane flies using engines and wings.");
    }
}
