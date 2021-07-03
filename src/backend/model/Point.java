package backend.model;

public class Point implements Movable {

    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void move(double deltaX, double deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }

/*
    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
    }    */

    @Override
    public String toString() {
        return String.format("{%.2f , %.2f}", x, y);
    }

}
