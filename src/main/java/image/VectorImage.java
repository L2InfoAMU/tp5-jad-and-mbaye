package image;

import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage implements Image {
    private int width;
    private int height;
    private List<Shape> shape;

    //Constructeur
    public VectorImage(List<Shape> shapes, int width, int height){
        this.height=height;
        this.width = width;
        this.shape= shapes;
    }

    //Les 5 methodes
    @Override
    public Color getPixelColor(int x, int y) {
        for(Shape c:shape){
            if(c.contains(new Point(x,y)))
                return c.getColor();
        }
        return Color.WHITE;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    protected void setWidth(int width){
        this.width = width;
    }

    protected void setHeight(int height){
        this.height = height;
    }
}