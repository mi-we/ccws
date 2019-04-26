package person;

class OlympicPersonNameStrategy extends PersonNameStrategy {

    private final boolean isSurnameFirst;

    OlympicPersonNameStrategy(boolean capitalizeSurname, boolean isSurnameFirst) {
        super(capitalizeSurname);
        this.isSurnameFirst = isSurnameFirst;
    }

    @Override
    String nameString(String givenName, String familyName) {
        if (isSurnameFirst) {
            return withFamilyNameFirst(givenName, familyName);
        } else {
            return withGivenNameFirst(givenName, familyName);
        }
    }

    private String withFamilyNameFirst(String givenName, String familyName) {
        return capitalizeIfNeeded(familyName) + " " + givenName;
    }
}
