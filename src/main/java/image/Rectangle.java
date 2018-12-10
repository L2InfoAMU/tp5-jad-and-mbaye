package image;

        import javafx.scene.paint.Color;

public class Rectangle implements Shape {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    //Constructeur
    Rectangle(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    //Les deux methodes
    @Override
    public boolean contains(Point point) {
        if((point.x > x)&&(point.x<x+width)&&(point.y>y)&&((point.y)<y+height))
            return true;
        return false;
    }

    @Override
    public Color getColor() {
        return color;
    }
}