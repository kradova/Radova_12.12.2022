package homework9;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Student> facultyJournal = new HashMap<>();

        Student person_1 = new Student("Alex", "Antonov", "111111", "group_1");
        Student person_2 = new Student("Maria", "Popova", "222222", "group_2");
        Student person_3 = new Student("Mark", "Tupov", "333333", "group_3");
        Student person_4 = new Student("Maks", "Nosov", "444444", "group_4");

        facultyJournal.put("Antonov", person_1);
        facultyJournal.put("Popova", person_2);
        facultyJournal.put("Tupov", person_3);
        facultyJournal.put("Nosov", person_4);

        printFacultyJournal(facultyJournal);
    }

    public static void printFacultyJournal(Map<String, Student> facultyJournal) {
        facultyJournal.entrySet().stream()
                .sorted(Map.Entry.<String, Student>comparingByKey())
                .forEach(student -> System.out.println(student.getKey() + " = " + student.getValue()));
    }
}
