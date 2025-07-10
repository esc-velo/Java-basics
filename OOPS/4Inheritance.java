package masteryws;

public class Inheritance {

    // Create a Vehicle class with a method move()
    // Create a Car class extending Vehicle and add a method playMusic()
    // Call both methods from a Car object in main

    public static void main(String[] args)
    {
        // Converting a subclass object (Car) to a superclass reference (Vehicle) is called UpCasting
        // safe and done implicitly
        Vehicle v = new Car("Maruti Suzuki", "Swift");
        v.move();

        // Converting a superclass reference (Vehicle) back to a subclass (Car) is called DownCasting
        // needs explicit condition
        Car car = (Car) v;
        car.playMusic();

        // Invalid downCasting
        Vehicle plainVehicle = new Vehicle("Generic", "Truck");

        try {
            Car wrongCar = (Car) plainVehicle;
            wrongCar.playMusic();              // This line won't run
        } catch (ClassCastException e) {
            System.out.println("⚠️ Cannot cast Vehicle to Car: " + e);
        }

        Bike bike = new Bike("TVS", "Apache");
        bike.playMusic();
        // No upcasting or downcasting here so runs well
    }

}

class Vehicle
{
    String company;
    String vehicleName;

    Vehicle(String company, String vehicleName)
    {
        this.company = company;
        this.vehicleName = vehicleName;
    }

    public void move()
    {
        System.out.println("Vehicle is moving");
    }
}

// Inheriting Vehicle class
class Car extends Vehicle
{

    Car(String company, String vehicleName)
    {
        super(company, vehicleName);
    }

    // Overrides move() of Vehicle class
    public void move()
    {
        System.out.println("Car is moving");
    }

    public void playMusic()
    {
        System.out.println("Car is playing music on Spotify");
    }
}

// Inheriting Vehicle class
class Bike extends Vehicle
{
    Bike(String company, String vehicleName)
    {
        super(company, vehicleName);
    }

    // Overrides move() of Vehicle class
    public void move()
    {
        System.out.println("Bike is moving");
    }

    public void playMusic()
    {
        System.out.println("Bike is playing music on Spotify");
    }
}
