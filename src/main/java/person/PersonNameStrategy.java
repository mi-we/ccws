package person;

abstract class PersonNameStrategy {
    private final boolean capitalizeSurname;

    PersonNameStrategy(boolean capitalizeSurname) {
        this.capitalizeSurname = capitalizeSurname;
    }

    abstract String nameString(String givenName, String familyName);

    String capitalizeIfNeeded(String familyName) {
        if (capitalizeSurname) {
            return familyName.toUpperCase();
        } else {
            return familyName;
        }
    }

    String withFamilyNameLast(String givenName, String familyName) {
        return givenName + " " + capitalizeIfNeeded(familyName);
    }
}
