package builders.facetedBuilders;

public class PersonBuilder {

    // reference to the object we are going to build!
    Person person = new Person();

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public Person build() {
        return person;
    }
}
