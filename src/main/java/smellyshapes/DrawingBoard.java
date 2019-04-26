package smellyshapes;

public class DrawingBoard {

    private final ShapeGroup shapeGroup = new ShapeGroup();
    private Color backgroundColor;

    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard();
        drawingBoard.setBackgroundColor(new Color("Green"));
        drawingBoard.add(new Square(new Point(-10, -10), 20));
        drawingBoard.load(args[0]);
        drawingBoard.drawOnScreen();
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void drawOnScreen() {
        // ...
    }

    public void load(String file) {
        // ...
    }

    public void add(Shape shape) {
        shapeGroup.add(shape);
    }

}
