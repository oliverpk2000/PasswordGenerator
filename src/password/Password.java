package password;

import java.util.Random;

public class Password {
    public Password() {
    }
    
    public String generate() {
        return this.generate(20);
    }

    public String generate(int length) {
        return generate(length, false);
    }

    public String generate(int length, boolean extended) {
        StringBuilder generatedPassword = new StringBuilder();
        Random random = new Random();
        int bound = 0;
        if (extended) {
            bound = 256;
        } else {
            bound = 128;
        }
        while (generatedPassword.length() < length) {
            generatedPassword.append((char) random.nextInt(bound));
        }
        return generatedPassword.toString();
    }
}
