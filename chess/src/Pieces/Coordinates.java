package Pieces;

/**
 * Class used to store position on board of a chess piece
 */

public class Coordinates {

    private int x_coord, y_coord;

    public Coordinates (int x, int y) {
        x_coord = x;
        y_coord = y;
    }

    public int getX() {
        return x_coord;
    }

    public int getY() {
        return y_coord;
    }

    //TODO change from x/y to chess shorthand
    public String toString () {
        return String.format("x: %d, y: %d", getX(), getY());
    }
}