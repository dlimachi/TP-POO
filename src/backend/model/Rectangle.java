package backend.model;

import java.util.List;
import java.util.ArrayList;

public class Rectangle extends Figure {

    protected final Point topLeft, bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    @Override
    public String toString() {
        return String.format("Rectangulo [ %s , %s ]", topLeft, bottomRight);
    }


    @Override
    boolean pointBelongs(Point point) {
        return point.getX() >= topLeft.getX() && point.getX() <= bottomRight.getX()
                && point.getY() >= getTopLeft().getY() && point.getY() <= bottomRight.getY();
    }

    @Override
    public List<Point> getPoints() {
        List<Point> toReturn = new ArrayList<>();
        toReturn.add(topLeft);
        toReturn.add(bottomRight);
        return toReturn;
    }
}
