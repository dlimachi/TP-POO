package frontend;

import backend.model.*;
import javafx.scene.control.ToggleButton;

public enum FigureButton {

    RECTANGLE(new ToggleButton("Rectángulo")){
        @Override
        public Figure getFigure(Point startPoint, Point endPoint) {
            return new Rectangle(startPoint,endPoint);
        }
    },
    CIRCLE(new ToggleButton("Círculo")){
        @Override
        public Figure getFigure(Point startPoint, Point endPoint) {
            return new Circle(startPoint, endPoint);
        }
    },
    SQUARE(new ToggleButton("Cuadrado")){
        @Override
        public Figure getFigure(Point startPoint, Point endPoint) {
            return new Square(startPoint,endPoint);
        }
    },
    ELLIPSE(new ToggleButton("Elipse")){
        @Override
        public Figure getFigure(Point startPoint, Point endPoint) {
            if(endPoint.getX() < startPoint.getX() || endPoint.getY() < startPoint.getY()) {
                throw new IllegalArgumentException("Formación de figura inválida");
            }
            return new Ellipse(startPoint, endPoint);
        }
    },
    LINE(new ToggleButton("Línea")){
        @Override
        public Figure getFigure(Point startPoint, Point endPoint) {
            return new Line(startPoint, endPoint);
        }
    };
    private final ToggleButton button;

    FigureButton(ToggleButton button) {
        this.button = button;
    }

    public ToggleButton getButton() {
        return button;
    }

    public static Figure findButton(Point startPoint, Point endPoint){
        for (FigureButton b : values()) {
            if(b.button.isSelected()){
                return b.getFigure(startPoint,endPoint);
            }
        }
        return null;
    }

    public abstract Figure getFigure(Point startPoint, Point endPoint);

}

