package smellyshapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A circle")
public class CircleTest {

    private Circle circle;

    @BeforeEach
    public void setUp() {
        circle = new Circle(Point.of(0, 0), 1);
        circle.setColor(new Color("Red"));
    }

    @Test
    @DisplayName("returns true if it contains a point and false if not")
    public void contains() {
        assertTrue(circle.contains(Point.of(0, 0)));
        assertTrue(circle.contains(Point.of(0, 1)));
        assertTrue(circle.contains(Point.of(1, 0)));

        assertFalse(circle.contains(Point.of(1, 1)));
        assertFalse(circle.contains(Point.of(-1, -1)));
        assertFalse(circle.contains(Point.of(1, -1)));
        assertFalse(circle.contains(Point.of(-1, 1)));
    }

    @Test
    @DisplayName("returns the number of containing points it contains when counted")
    public void countContainingPoints() {
        final int[] xCords = new int[]{0, 10};
        final int[] yCords = new int[]{0, 10};
        int result = circle.countContainingPoints(Point.of(xCords, yCords));

        assertEquals(1, result);
    }

    @Test
    @DisplayName("returns a valid xml representation when converted to xml")
    public void toXml() {
        String xml = circle.toXml();

        assertEquals("<circle x=\"0\" y=\"0\" radius=\"1\" />\n", xml);
    }

    @Test
    @DisplayName("returns a formatted string when converted to string")
    public void toString_() {
        assertEquals("Circle: (0,0) radius= 1 RGB=255,0,0", circle.toString());
    }
}
