package backend.model;

import java.util.ArrayList;
import java.util.List;

public class Ellipse extends Figure{

    protected Point centerPoint;
    public double xAxis, yAxis;
    protected Point topLeft;
    protected Point bottomRight;

    public Ellipse(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.xAxis = (bottomRight.getX() - topLeft.getX()) / 2;
        this.yAxis = (topLeft.getY() - bottomRight.getY()) / 2;
        this.centerPoint = new Point(topLeft.getX() + xAxis/2 , topLeft.getY() + yAxis/2 );
    }

    @Override
    public String toString() {
        return String.format("Elipse [Centro: %s, DMayor: %.2f, DMenor: %.2f]",
                centerPoint, xAxis, yAxis);
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    @Override
    public boolean pointBelongs(Point point) {
        double h = centerPoint.getX();
        double k = centerPoint.getY();
        return ((Math.pow(point.getX() - h , 2)) / (Math.pow(xAxis, 2)) ) + (Math.pow( point.getY() - k, 2) / Math.pow(yAxis, 2)) <= 1;
    }

    @Override
    public List<Point> getPoints() {
        List<Point> toReturn = new ArrayList<>();
        toReturn.add(centerPoint);
        return toReturn;
    }
}
