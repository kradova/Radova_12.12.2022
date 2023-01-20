package homework9;

public class Student {
    private String name;
    private String surname;
    private String number;
    private String group;

    public Student(String name, String surname, String number, String group) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.group = group;
    }

    @Override
    public String toString() {
        return "name: " + name + ", surname: " + surname + ", number: " + number + ", group: " + group;
    }
}
