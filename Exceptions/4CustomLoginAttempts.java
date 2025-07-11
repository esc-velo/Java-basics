import java.util.Scanner;

public class loginAttempts {
    public static void main(String[] args) {
        // Build a program where a user tries to log in
        // If the password is wrong more than 3 times, throw a custom TooManyAttemptsException
        // Create a custom exception
        // Use a counter to track attempts
        // Wrap it in a loop or simulate repeated attempts
        // Use Scanner (optional) or hardcode for now

        String correctPass = "RJDSFKJ";
        Scanner scanner = new Scanner(System.in);

        boolean loggedin = false;
        final int maxAttempts = 3;
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("Enter password: ");
            String userInput = scanner.nextLine();

            if (userInput.equals(correctPass) && !loggedin) {
                System.out.println("You have successfully logged in.");
                loggedin = true;
            }
            else {
                System.out.println(STR."Wrong password. \{maxAttempts - attempts} left");
                attempts++;
            }
        }

        if (!loggedin) {
            try {
                throw new TooManyAttemptsException("Too many failed login attempts. Account locked.");
            }
            catch (TooManyAttemptsException e) {
                System.err.println(STR."Error: + \{e.getMessage()}");
            }
        }

        scanner.close();
    }
}

class TooManyAttemptsException extends Exception {
    public TooManyAttemptsException(String message) {
        super(message);
    }
}
