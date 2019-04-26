package smellyshapes;

import java.util.ArrayList;
import java.util.List;

public class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public static List<Point> of(int[] xCords, int[] yCords) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < xCords.length; ++i) {
            points.add(of(xCords[i], yCords[i]));
        }
        return points;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return String.format("%d,%d", getX(), getY());
    }
}
