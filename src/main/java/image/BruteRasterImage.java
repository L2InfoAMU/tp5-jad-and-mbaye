
package image;

import image.Image;
import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {

    // Les attributs de notre classe
    Color[][] colors;
    Color color;
    int width;
    int height;

    // COINSTRUCTEURS
    public BruteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        colors = new Color[width][height];
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {
                colors[x][y] = color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors){
        width = Matrices.getRowCount(colors);
        height = Matrices.getColumnCount(colors);
        this.colors = new Color[width][height];
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {
                this.colors[x][y] = colors[x][y];
            }
        }
    }

    // METHODES // GETTERS // SETTERS
    public void createRepresentation(){
        this.colors = new Color[this.width][this.height];
    }


    public void setPixelColor(Color color, int x, int y){
        this.color = colors[x][y];
    }

    public void setPixelsColor(Color[][] pixels) {
        width = Matrices.getRowCount(colors);
        height = Matrices.getColumnCount(colors);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.colors[x][y] = pixels[x][y];
            }
        }
    }

    private void setPixelsColor(Color color){
        width = Matrices.getColumnCount(colors);   //largeur
        height = Matrices.getRowCount(colors);     //hauteur
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.colors[x][y] = color;
            }
        }
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return colors[x][y];
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


