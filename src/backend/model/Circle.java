package backend.model;

public class Circle extends Ellipse {

    private double radius;

    public Circle(Point topLeft, Point bottomRight){
        super(topLeft, bottomRight);
        this.radius = xAxis;
    }

    @Override
    public String toString() {
        return String.format("Círculo [Centro: %s, Radio: %.2f]", centerPoint, radius);
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public double getRadius() {
        return radius;
    }

}
