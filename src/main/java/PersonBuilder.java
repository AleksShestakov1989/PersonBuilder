public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Age error");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.name == null || this.surname == null) {
            throw new IllegalArgumentException("Name or surname not found");
        }
        return new Person(this);
    }

}
