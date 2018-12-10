package image;

import javafx.scene.paint.Color;

public abstract class RasterImage implements Image{
    abstract public void createRepresentation();
    abstract public void setPixelColor(Color color, int x, int y);
    abstract protected void setPixelsColor(Color[][] pixels);
    abstract protected void setPixelsColor(Color color);
    abstract protected void setWidth(int width);
    abstract protected void setHeight(int height);
    abstract public Color getPixelColor(int x, int y);
    abstract public int getWidth();
    abstract public  int getHeight();
}