package masteryws;

public class UpDownCasting {

    public static void main(String[] args)
    {
        //UpCasting
        Device phone = new smartPhone("Samsung Galaxy S23", "smartPhone", "Android");
        phone.turnOn();

        //DownCasting
        smartPhone phoneSmart = (smartPhone) phone;
        phoneSmart.browsingInternet();

        Device device = new Device("Sony","TV");

        try {
            smartPhone mobile = (smartPhone) device;
            mobile.browsingInternet();
        } catch (Exception e) {
            System.out.println("Cannot downcast " + e);
        }
    }

}

class Device
{
    String brand;
    String type;

    Device(String brand, String type)
    {
        this.brand = brand;
        this.type = type;
    }
    public void turnOn()
    {
        System.out.println(brand + " " + type + " is turning on");
    }
}

class smartPhone extends Device
{
    String os;

    smartPhone(String brand, String type, String os)
    {
        super(brand, type);
        this.os = os;
    }

    public void browsingInternet()
    {
        System.out.println(brand + " " + type + " is browsing internet on " + os + " OS");
    }
}