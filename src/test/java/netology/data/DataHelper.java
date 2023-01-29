package netology.data;

import com.github.javafaker.Faker;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataHelper {

    private static Faker faker = new Faker();

    public static UserData validUser() {
        return new UserData("vasya", "qwerty123");
    }

    public static String validVerifyCode(String login) {
        String verifyCode = DataBase.getValidVerifyCode(login);
        return verifyCode;
    }

    public static String invalidPass() {
        String randomPass = faker.internet().password();
        return randomPass;
    }
}
