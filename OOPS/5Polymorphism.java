package masteryws;

public class Polymorphism {
    // Create a Shape superclass and three subclasses: Circle, Rectangle, and Triangle, all with a method draw()
    // In main(), create a Shape[] array and assign it with different subclass objects
    // Use a loop to call draw() on each — observe how Java binds it dynamically

    public static void main(String[] args)
    {
        Shapes[] shape = new Shapes[3];
        shape[0] = new Rectangle(3,4);
        shape[1] = new Circle(4);
        shape[2] = new Triangle(3,2);

        for (int i = 0; i < shape.length; i++)
        {
            shape[i].draw();
            shape[i].area();
            System.out.println();
        }
    }
}

// Abstract class: 
// abstract keyword is used before 'class Shapes'.
// it CANNOT be instantiated i.e an object of this class cannot be created
// Why? because, abstract class may contain empty methods which means incomplete classes
// This can cause undefined behavior

abstract class Shapes {
    public void draw() {
        System.out.println("Drawing Shapes");
    }
    abstract public void area();
}

class Circle extends Shapes {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void area() {
        System.out.println("Area of Circle : " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shapes
{
    int length, breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public  void draw() {
        System.out.println("Drawing Rectangle");
    }
    public void area() {
        System.out.println("Area of Rectangle : "  + (length * breadth));
    }
}

class Triangle extends Shapes
{
    int base, height;
    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    public  void draw() {
        System.out.println("Drawing Triangle");
    }
    public void area()
    {
        System.out.println("Area of Triangle : " + (0.5 * (base * height)));
    }
}

