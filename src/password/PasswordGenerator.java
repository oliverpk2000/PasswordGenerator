package password;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Password password = new Password();
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("length: ");
        System.out.println(password.generate(inputScanner.nextInt()));
    }
}
