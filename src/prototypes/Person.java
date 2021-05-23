package prototypes;

import java.util.Arrays;

public class Person {

    private String[] names;
    private Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    public Person(Person other) {
        names = other.names.clone();
        address = new Address(other.address);
    }

    public Address getAddress() {
        return this.address;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }
}
