import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
    }


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (getAge().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasAddress() {
        if (getAddress() == null) {
            return false;
        } else {
            return true;
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        OptionalInt optionalInt = OptionalInt.of(this.age);
        return optionalInt;
    }


    public void happyBirthday() {
        this.age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname).setAge(this.age).setAddress(this.address);
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " из " + getAddress();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
