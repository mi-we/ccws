package person;

class DefaultPersonNameStrategy extends PersonNameStrategy {
    DefaultPersonNameStrategy(boolean capitalizeSurname) {
        super(capitalizeSurname);
    }

    @Override
    String nameString(String givenName, String familyName) {
        return withFamilyNameLast(givenName, familyName);
    }
}
