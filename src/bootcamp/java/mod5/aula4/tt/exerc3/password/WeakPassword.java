package bootcamp.java.mod5.aula4.tt.exerc3.password;

import java.util.regex.Pattern;

public class WeakPassword extends Password {
    public WeakPassword() throws Exception {
        super("^[a-z0-9]{3,}$");
    }

    public static void main(String[] args) throws Exception {
        Password.test(new WeakPassword());
    }
}
