package password;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Password password = new Password();
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("length: ");
        int length = inputScanner.nextInt();
        String securePassword = password.generate();
        System.out.println(securePassword);
        int tries = 0;
        while (true){
            tries++;
            String generatedPassword = password.generate(length);
            if(securePassword.equals(generatedPassword)){
                System.out.println(generatedPassword);
                break;
            }
        }
        System.out.printf("this took %s tries%n", tries);
    }
}
