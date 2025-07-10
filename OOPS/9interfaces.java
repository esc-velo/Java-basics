public class Interfaces {

    public static void main(String[] args)
    {
        Flyable[] flyers = new Flyable[2];
        flyers[0] = new Bird();
        flyers[1] = new Plane();

        for (Flyable f : flyers){
            f.fly();
        }
    }
}

interface Flyable{
    void fly();
}

// keyword for interface extension in another class : implements
class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird flies by flapping its wings.");
    }
}

class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Aeroplane flies using engines and wings.");
    }
}
