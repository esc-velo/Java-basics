package masteryws;

public class FinalC {

    public static void main(String[] args)
    {
            MathUtils n = new MathUtils(8);
            n.factorial(8);
    }
}

// final classes cannot be inherited
class MathUtils
{
    int n;

    MathUtils(int n)
    {
        this.n = n;
    }

    public int factorial(int n)
    {
        int fact = 1;
        if (n == 1 || n == 0)
            return 1;
        else
            fact = n * factorial(n - 1);
        return fact;
    }
}

// Error due to final keyword. Remove final to inherit from MathUtils
class sum extends MathUtils
{
    sum(int n) {
        super(n);
    }
}
