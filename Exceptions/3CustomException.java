import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Age : ");
            int age = sc.nextInt();
            validateAge(age);
        } catch (AgeTooSmallException e) {
            System.out.println(STR."Error: \{e.getMessage()}");
        }
    }

    static void validateAge(int age) throws AgeTooSmallException {
        if (age < 18) {
            throw new AgeTooSmallException(STR."Come back in \{18 - age} years");
        }
        else {
            System.out.println("Valid Age");
        }
    }
}

class AgeTooSmallException extends Exception {
    AgeTooSmallException(String message) {
        super(message);
    }
}
