package person;

public class Person {
    private PersonNameStrategy personNameStrategy;
    private String familyName;
    private String givenName;

    public Person(String familyName, String givenName, PersonNameStrategy personNameStrategy) {
        this.familyName = familyName;
        this.givenName = givenName;
        this.personNameStrategy = personNameStrategy;
    }

    @Override
    public String toString() {
        return personNameStrategy.nameString(givenName, familyName);
    }
}
