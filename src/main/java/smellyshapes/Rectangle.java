package smellyshapes;


public class Rectangle extends Shape {

    protected Color c = new Color("Blue");
    int width;
    int height;
    private int x;
    private int y;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean contains(int x, int y) {
        return this.x <= x && x <= this.x + width && this.y <= y && y <= this.y + height;
    }

    public int calculate() {
        return width*height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return String.format("Rectangle: (%d,%d) width=%d height=%d color=%s", x, y, width, height,
                             c.getColorAsHex());
    }
}
