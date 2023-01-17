package homework6;

public class Employee extends Person {

    private String occupation;

    public Employee(String firstName, String lastName, String city, String phone, String occupation) {
        super(firstName, lastName, city, phone);
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String call() {
        return "You can call the " + occupation + " " + getFirstName() + " " + getLastName() + " from city " + getCity() + " by number " + getPhone() + ".";
    }//call()

}
