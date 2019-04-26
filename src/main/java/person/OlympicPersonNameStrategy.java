package person;

class OlympicPersonNameStrategy extends PersonNameStrategy {

    private final boolean isSurenameFirst;

    OlympicPersonNameStrategy(boolean capitalizeSurname, boolean isSurenameFirst) {
        super(capitalizeSurname);
        this.isSurenameFirst = isSurenameFirst;
    }

    @Override
    String nameString(String givenName, String familyName) {
        if (isSurenameFirst) {
            return withFamilyNameFirst(givenName, familyName);
        } else {
            return withFamilyNameLast(givenName, familyName);
        }
    }

    private String withFamilyNameFirst(String givenName, String familyName) {
        return capitalizeIfNeeded(familyName) + " " + givenName;
    }
}
