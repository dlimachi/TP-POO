package backend.model;

public class Square extends Rectangle {

    private double side;

    public Square(Point topLeft, Point bottomRight) {
        super(topLeft, new Point(topLeft.getX() +  (topLeft.getX() - bottomRight.getX()),
                topLeft.getY() +  (topLeft.getX() - bottomRight.getX()) ));
        this.side = topLeft.getX() - bottomRight.getX();
    }

    private double getSide(){
        return side;
    }

    @Override
    public String toString() {
        return String.format("Cuadrado: [%s , %s ]", topLeft, bottomRight);
    }

}
