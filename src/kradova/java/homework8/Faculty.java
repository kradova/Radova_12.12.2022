package homework8;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private static final List<Student> students = new ArrayList<>();
    private static boolean exist;

    public static void printStudents(int course) {
        System.out.println("Course #" + course);
        exist = false;
        students.stream().filter(student -> student.getCourse() == course)
                .forEach(student -> {
                    System.out.println(student.getName());
                    exist = true;
                });
        if (!exist) {
            System.out.println("There are no students in the course #" + course + " or such course does not exist at all");
        }
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void removeStudent(Student student) {
        students.remove(student);
    }
}
