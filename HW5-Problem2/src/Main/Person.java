package Main;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private int age;
    private String firstName;
    private String lastName;
    private Address address;



    public Person(int age, String firstName, String lastName, Address address) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}'+"\n\n";
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }
    public int getFirstNameLength(){
        return firstName.length();
    }

    public String getAddressCity() {
        return address.getCity();
    }
    public int getAddressZone() {
        return address.getZone();
    }

}