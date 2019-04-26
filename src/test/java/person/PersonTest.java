package person;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("A person")
class PersonTest {

    @Test
    @DisplayName("in default mode prints 'firstname surname'")
    void toString_defaultMode() {
        Person michael = new Person("Ammann", "Simon", new PersonNameStrategy("CH", false, false));
        assertEquals("Simon Ammann", michael.toString());
    }

    @Test
    @DisplayName("in olympic mode with capitalize surname prints 'firstname LASTNAME'")
    void toString_olympicModeAndCapitalize() {
        Person michael = new Person("Ammann", "Simon", new PersonNameStrategy("CH", true, true));
        assertEquals("Simon AMMANN", michael.toString());
    }

    @Test
    @DisplayName("in default mode without capitalization and part of 'surname-first' nationality prints 'firstname lastname'")
    void toString_chineseInNonOlympicNonCapitalize() {
        Person yao = new Person("Yao", "Ming", new PersonNameStrategy("CHN", false, false));
        assertEquals("Ming Yao", yao.toString());
    }

    @Test
    @DisplayName("in olympic mode without capitalization and part of 'surname-first' nationality prints 'lastname firstname'")
    void toString_chineseInOlympicMode() {
        Person yao = new Person("Yao", "Ming", new PersonNameStrategy("CHN", true, false));
        assertEquals("Yao Ming", yao.toString());
    }

    @Test
    @DisplayName("in olympic mode with capitalization and part of 'surname-first' nationality prints 'LASTNAME firstname'")
    void toString_chineseInOlympicModeAndCapitalize() {
        Person yao = new Person("Yao", "Ming", new PersonNameStrategy("CHN", true, true));
        assertEquals("YAO Ming", yao.toString());
    }

}
