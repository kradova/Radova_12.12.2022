package homework6;

public class Main {
    public static void main(String[] args) {

        Person person_1 = new Person("Will", "Smith", "New York", "2936729462846");
        System.out.println(person_1.call());

        Person person_2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println(person_2.call());

        Person person_3 = new Person("Sherlock ", "Holmes ", "London", "37742123513");
        System.out.println(person_3.call());

        System.out.println(person_1.call(person_2));
        System.out.println(person_1.call(person_1));

        Person person_4 = new Person("Will", "Smith", "New York", "2936729462846");
        System.out.println(person_1.call(person_4));

        Employee employee_1 = new Employee("Sherlock ", "Holmes ", "London", "37742123513", "detective");
        System.out.println(employee_1.call());

        Person employee_2 = new Employee("Will", "Smith", "New York", "2936729462846", "actor");
        System.out.println(employee_2.call());

        System.out.println(employee_1.call(employee_2));
        System.out.println(person_3.call(employee_1));
    }
}
