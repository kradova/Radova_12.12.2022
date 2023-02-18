package homework15;

import java.io.*;

public class UserData implements Serializable {
    private String name;
    private String email;
    private Integer age;

    public UserData() {
    }

    public UserData(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void serialize(String filePath) {
        File f = new File(filePath);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try (BufferedWriter fr = new BufferedWriter(new FileWriter(f))) {

            if (name != null) {
                fr.write("name: " + name);
                fr.newLine();
            }
            if (email != null) {
                fr.write("email: " + email);
                fr.newLine();
            }
            if (age > 0) {
                fr.write("age: " + age);
                fr.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static UserData deserialize(String filePath) {
        File f = new File(filePath);
        if (f.exists()) {
            try (BufferedReader fr = new BufferedReader(new FileReader(f))) {
                UserData user = new UserData();
                while (fr.ready()) {
                    String line = fr.readLine();
                    if (line != null) {
                        String key = line.substring(0, line.indexOf(":"));
                        String value = line.substring(line.indexOf(":") + 2);
                        switch (key) {
                            case "name" -> user.name = value;
                            case "email" -> user.email = value;
                            case "age" -> user.age = Integer.parseInt(value);
                        }
                    }
                }
                return user;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" +
                "email: " + email + "\n" +
                "age: " + age;
    }
}
