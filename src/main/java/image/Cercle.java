package image;

import javafx.scene.paint.Color;

public class Cercle implements  Shape {
    private int radius;
    private int x;
    private int y;
    private Color color;
 public Cercle(int radius, int x, int y, Color color){
     this.radius=radius;
     this.x=x;
     this.y=y;
     this.color = color;
 }
 @Override
 public boolean contains(Point point){
        if(point.x-radius<=x && x<=point.x+radius && point.y-radius<=y && y<=point.y+radius)
            return true;
        else
            return false;
    }

    @Override
    public Color getColor() {
        return color;
    }


}
