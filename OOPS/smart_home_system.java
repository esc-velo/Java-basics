package masteryws;

public class smart_home_system {
    public static void main(String[] args)
    {
        Fan fan = new Fan(true);
        Light light = new Light(true);
        AC ac = new AC(false);

        SmartRemote remote = new SmartRemote(fan);
        remote.toggle();

        remote.SetDevice(light);
        remote.toggle();

        remote.SetDevice(ac);
        remote.toggle();
    }
}

interface Switchable{

    void turnOn();
    void turnOff();
    boolean getStatus();
}

class Fan implements Switchable{

    boolean DevStatus;
    Fan(boolean DevStatus)
    {
        this.DevStatus = DevStatus;
        if (this.DevStatus) {
            turnOn();
        } else {
            turnOff();
        }
    }

    @Override
    public void turnOn(){
        System.out.println("Fan is spinning.");
        this.DevStatus = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turned off");
        this.DevStatus = false;
    }

    public boolean getStatus() {
        return DevStatus;
    }
}

class Light implements Switchable{
    boolean DevStatus;
    Light(boolean DevStatus)
    {
        this.DevStatus = DevStatus;
        if (this.DevStatus) {
            this.turnOn();
        } else {
            this.turnOff();
        }
    }
    @Override
    public void turnOn(){
        System.out.println("Light turned on");
        this.DevStatus = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Light turned off");
        this.DevStatus = false;
    }
    public boolean getStatus() {
        return DevStatus;
    }
}

class AC implements Switchable{

    boolean DevStatus;
    AC(boolean DevStatus)
    {
        this.DevStatus = DevStatus;
        if (this.DevStatus) {
            this.turnOn();
        }
        else {
            this.turnOff();
        }
    }

    @Override
    public void turnOn(){
        System.out.println("AC is cooling the room!");
        this.DevStatus = true;
    }
    @Override
    public void turnOff() {
        System.out.println("AC is turned off");
        this.DevStatus = false;
    }
    public boolean getStatus() {
        return DevStatus;
    }
}

class SmartRemote{

    Switchable device;

    SmartRemote(Switchable device){
        this.device = device;
    }

    public void toggle(){
        System.out.println("Toggling " + device.getClass().getSimpleName() + " status.");
        if (device.getStatus()) device.turnOff();
        else device.turnOn();
    }

    public void SetDevice(Switchable device){
        this.device = device;
    }
}