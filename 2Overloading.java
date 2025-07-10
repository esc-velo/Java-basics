package masteryws;

public class Calc {

    // This code helps us learn method overloading

    public static void main(String[] args)
    {
        calculator myCalc = new calculator();
        System.out.println(STR."Integer Addition : \{myCalc.add(4, 5)}");
        System.out.println(STR."Double Addition : \{myCalc.add(4.5, 5.56)}");
        System.out.println(STR."String Addition : \{myCalc.add("hello ", "world")}");
    }

}
class calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public double add(double a, double b)
    {
        return a + b;
    }

    public String add(String a, String b)
    {
        return a + b;
    }
}
