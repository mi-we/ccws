package smellyshapes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("A square")
public class SquareTest {

    @Test
    @DisplayName("should have an area of 4 when the edge length is 2")
    public void calculateArea() {
        Square square = new Square(new Point(0, 0), 2);
        assertEquals(4, square.calculate());
    }

    @Test
    @DisplayName("has a formatted toString() method")
    public void squareToString() {
        Square square = new Square(new Point(0, 0), 1, new Color("Red"));
        assertEquals("Square: (0,0) edgeLength=1 color=#FF0000", square.toString());
    }

    @Test
    @DisplayName("returns a valid xml representation when converted to xml")
    public void toXml() {
        Square square = new Square(new Point(0, 1), 2);
        String xml = square.toXml();
        assertEquals("<square x=\"0\" y=\"1\" edgeLength=\"2\" />\n", xml);
    }

    @Test
    @DisplayName("can determine if it contains points")
    public void containsPoints() {
        Square square = new Square(new Point(0, 0), 1);

        assertTrue(square.containsPoint(new Point(0, 0)));
        assertTrue(square.containsPoint(new Point(0, 1)));
        assertTrue(square.containsPoint(new Point(1, 1)));
        assertTrue(square.containsPoint(new Point(1, 0)));

        assertFalse(square.containsPoint(new Point(-1, -1)));
        assertFalse(square.containsPoint(new Point(-1, 0)));
        assertFalse(square.containsPoint(new Point(0, -1)));
        assertFalse(square.containsPoint(new Point(1, 2)));
        assertFalse(square.containsPoint(new Point(2, 1)));
    }

    @Test
    @DisplayName("returns true if it contains two points and false if either of the two points is outside the square")
    public void containsTwoPoints(){
        Square square = new Square(new Point(0, 0), 2);
        assertTrue(square.contains(Point.of(1, 1), Point.of(2, 2)));
        assertTrue(square.contains(Point.of(0, 1), Point.of(1, 2)));

        assertFalse(square.contains(Point.of(3, 1), Point.of(2, 2)));
        assertFalse(square.contains(Point.of(0, 1), Point.of(3, 2)));
    }

    @Test
    @DisplayName("throws an exception when getHeight() is called")
    public void getHeigth() {
        assertThrows(RuntimeException.class, () -> new Square(new Point(0, 0), 0).getHeight());
    }
}
