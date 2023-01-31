
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        // Prompt the user for the password
        System.out.println("Password?");
        String password = scan.nextLine();

        if (password.equals("Caput Draconis")) {
            // Print 'Welcome!' if the password is correct
            System.out.println("Welcome!");
        } else {
            // Print 'Off with you!' if the password is incorrect
            System.out.println("Off with you!");
        }
    }
}
