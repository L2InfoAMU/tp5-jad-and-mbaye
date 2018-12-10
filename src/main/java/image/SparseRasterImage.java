package image;

import javafx.scene.paint.Color;
import java.util.HashMap;
import java.util.Map;
import static util.Matrices.*;

public class SparseRasterImage extends RasterImage {
    private int height;
    private int width;
    private Map<String, Color> colors;

    //Constructeur 1
    public SparseRasterImage(Color color, int width, int height){
        this.height=height;
        this.width = width;
        createRepresentation() ;
        setPixelsColor(color);
    }

    //Constructeur 2
    public SparseRasterImage(Color[][] pixels){
        this.width = getRowCount(pixels);
        this.height = getColumnCount(pixels);
        createRepresentation();
        requiresNonNull(pixels);
        requiresNonZeroDimensions(pixels);
        requiresRectangularMatrix(pixels);
        setPixelsColor(pixels);
    }

    // Les 9 méthodes
    @Override
    public void createRepresentation() {
        colors = new HashMap<String, Color>();
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        if(colors.containsKey(String.valueOf(x)+"."+(String.valueOf(y))))
            colors.put(String.valueOf(x)+"."+(String.valueOf(y)),color);

    }

    @Override
    protected void setPixelsColor(Color[][] pixels) {
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++)
                colors.put(String.valueOf(x)+"."+(String.valueOf(y)),pixels[x][y]);
    }

    @Override
    protected void setPixelsColor(Color color) {
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++)
                colors.put(String.valueOf(x)+"."+(String.valueOf(y)),color);
    }

    @Override
    protected void setWidth(int width) {
        this.width = width;
    }

    @Override
    protected void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return colors.get(String.valueOf(x)+"."+(String.valueOf(y)));
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}