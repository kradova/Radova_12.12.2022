package homework15;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final String FILE_PATH = "src/kradova/java/homework15/user_data.txt";

        UserData user = new UserData("Kate", "test@test.com", 20);
        user.serialize(FILE_PATH);

        UserData deserializeUser = UserData.deserialize(FILE_PATH);
        System.out.println(deserializeUser);

        UserData user_2 = new UserData();
        user_2.setName("Dasha");
        user_2.setAge(18);
        user_2.serialize(FILE_PATH);

        UserData deserializeUser2 = UserData.deserialize(FILE_PATH);
        System.out.println(deserializeUser2);
    }
}
