package backend.model;

import java.util.List;

public class Line extends Figure{

    private final Point start, end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    @Override
    boolean pointBelongs(Point point) {
        return false;
    }

    @Override
    List<Point> getPoints() {
        return null;
    }

    @Override
    public void move(double moveInX, double moveInY) {

    }

    @Override
    public String toString() {
        return String.format("Linea [%.2f , %.2f]", start, end);
    }
}
