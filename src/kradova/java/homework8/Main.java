package homework8;

public class Main {
    public static void main(String[] args) {

        Student student_1 = new Student("Maria", 1);
        Student student_2 = new Student("Ivan", 2);
        Student student_3 = new Student("Maks", 3);

        Faculty.addStudent(student_1);
        Faculty.addStudent(student_2);
        Faculty.addStudent(student_3);

        Faculty.removeStudent(student_2);

        Faculty.printStudents(2);
        Faculty.printStudents(1);
        Faculty.printStudents(21);
    }
}
