package homework8;

import java.util.LinkedList;
import java.util.List;

public class Faculty {
    static private final List<Student> students = new LinkedList<Student>();

    public static void printStudents(int course) {
        System.out.println("Course #" + course);
        boolean exist = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                exist = true;
            }
        }
        if (!exist) {
            System.out.println("There are no students in the course #" + course + " or such course does not exist at all");
        }
    }//printStudents

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void removeStudent(Student student) {
        students.remove(student);
    }
}//Faculty
