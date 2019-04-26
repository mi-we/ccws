package smellyshapes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class ShapeGroup implements Shape {

    private boolean readOnly = false;
    private Set<Shape> shapes = new LinkedHashSet<>();

    public ShapeGroup() {
    }

    public ShapeGroup(Set<Shape> shapes, boolean readOnly) {
        this.shapes.addAll(shapes);
        this.readOnly = readOnly;
    }

    public void add(Shape shape) {
        if (readOnly || contains(shape)) {
            return;
        }

        addToShapes(shape);
    }

    private void addToShapes(Shape shape) {
        this.shapes.add(shape);
    }

    public boolean contains(Shape shape) {
        return shapes.contains(shape);
    }

    public boolean contains(Point point) {
        return shapes.stream()
                .filter(Objects::nonNull)
                .anyMatch(shape -> shape.contains(Point.of(point.getX(), point.getY())));
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();

        builder.append("<shapegroup>\n");
        this.shapes.stream()
                .map(Shape::toXml)
                .forEach(builder::append);
        builder.append("</shapegroup>\n");

        return builder.toString();
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public int getSize() {
        return shapes.size();
    }
}
