package password;

public class PasswordMain {
    public static void main(String[] args) {
        Password password = new Password();
        System.out.println(password.generate());
        System.out.println(password.generate(35));
    }
}
