package person;

import java.util.ArrayList;
import java.util.List;

public class PersonNameStrategy {
    private static List<String> surnameFirst = new ArrayList<>();

    static {
        surnameFirst.add("CHN");
        surnameFirst.add("KOR");
        // etc...
    }

    private final String nationality;
    private final boolean olympicMode;
    private final boolean capitalizeSurname;

    public PersonNameStrategy(String nationality, boolean olympicMode, boolean capitalizeSurname) {
        this.nationality = nationality;
        this.olympicMode = olympicMode;
        this.capitalizeSurname = capitalizeSurname;
    }

    String nameString(String givenName, String familyName) {
        String surname = familyName;
        if (capitalizeSurname) {
            surname = familyName.toUpperCase();
        }
        if (surnameFirst())
            return surname + " " + givenName;
        else
            return givenName + " " + surname;
    }

    private boolean surnameFirst() {
        if (!olympicMode)
            return false;
        return surnameFirst.contains(nationality);
    }
}
