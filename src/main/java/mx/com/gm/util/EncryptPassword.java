package mx.com.gm.util;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptPassword {

    public static void main(String[] args) {
        var password = "123";
        System.out.println("Password: " +password );
        System.out.println("Password encriptado: " + encryptPassword(password));

    }

    public static String encryptPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
