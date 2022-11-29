package password;

import java.util.Random;

public class Password {
    public Password() {
    }

    public String generate() {
        return this.generate(20);
    }

    public String generate(int length) {
        StringBuilder generatedPassword = new StringBuilder();
        Random random = new Random();
        int bound = 96;
        while (generatedPassword.length() < length) {
            int ascii = random.nextInt(bound) + 32;
            generatedPassword.append((char) ascii);
        }
        return generatedPassword.toString();
    }
}
