package backend.model;

import java.util.List;

public abstract class Figure implements Movable {

   abstract boolean pointBelongs(Point point);

   abstract List<Point> getPoints();

   @Override
   public void move(double deltaX, double deltaY) {
       for(Point point : this.getPoints()) {
           point.move(deltaX, deltaY);
       }
   }

}

