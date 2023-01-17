package homework6;

import java.util.Objects;

public class Person implements Callable {

    private String firstName;
    private String lastName;
    private String city;
    private String phone;

    public Person(String firstName, String lastName, String city, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String call() {
        return "You can call a citizen " + firstName + " " + lastName + " from city " + city + " by number " + phone + ".";
    }//call()

    @Override
    public String call(Person otherPerson) {
        if (isTheSamePerson(otherPerson)) {
            return "It is impossible to call yourself";
        } else {
            return "Citizen " + this.firstName + " " + this.lastName + " calls citizen " + otherPerson.firstName + " " + otherPerson.lastName + " on " + otherPerson.phone;
        }
    }//call(Person)

    public boolean isTheSamePerson(Person otherPerson) {
        if (this.equals(otherPerson)) {
            return true;
        } else {
            return false;
        }
    }//isTheSamePerson

    @Override
    public boolean equals(Object otherPerson) {
        if (this == otherPerson) return true;
        if (!(otherPerson instanceof Person person)) return false;
        return this.getFirstName().equals(person.getFirstName())
                && getLastName().equals(person.getLastName())
                && getCity().equals(person.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getCity());
    }
}//class Person
