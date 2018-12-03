package image;

import javafx.scene.paint.Color;

import java.util.List;

public class PaletteRasterImage implements Image {
    int width;
    int height;
    int [][] indexOfColors;
    List<Color> palette;

    public PaletteRasterImage(int width, int height, int[][] indexOfColors, List<Color> palette) {
        this.width = width;
        this.height = height;
        this.indexOfColors = indexOfColors;
        this.palette = palette;
    }

    public PaletteRasterImage(Color[][] pixels) {


    }

    public void createRepresentation() {

    }

    public void setPixelColor(Color color, int x, int y) {

    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    public void setPixelsColor(Color[][] pixels) {

    }

    private void setPixelsColor(Color color) {

    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }
}