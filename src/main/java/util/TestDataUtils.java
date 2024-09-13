package util;

import java.util.Random;

public class TestDataUtils {
    public String generateRandomEmail() {
        return "test" + System.currentTimeMillis() + "@example.com";
    }

    public String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public String generateRandomPhoneNumber() {
        return "+353" + (1000000000 + new Random().nextInt(900000000));
    }
}
