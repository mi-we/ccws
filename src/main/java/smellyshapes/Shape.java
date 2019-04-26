package smellyshapes;

public interface Shape {
    String toXml();

    boolean contains(int x, int y);
}
