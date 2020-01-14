package Pieces;

import java.util.ArrayList;

/**
 * Abstract Piece Class contains generic Piece functions
 */
public abstract class Piece {

    //enum list of chess pieces
    public enum Type {
        KING, QUEEN, BISHOP, KNIGHT, ROOK, PAWN
    };

    private Type type;
    private Coordinates coordinates;
    //might want to add constant validMoves array
    //so that it doesn't need to be calculated over and over


    //initializes Piece with type and board position
    public Piece(Type type, int x, int y) {
        this.type = type;
        coordinates = new Coordinates(x, y);
    }

    public Type getType() {
        return type;
    }

    public Coordinates getCoord() {
        return coordinates;
    }

    //Moves piece to new location if valid
    public void move(int x_coord, int y_coord)
        throws IllegalArgumentException {
        Coordinates dest = new Coordinates(x_coord, y_coord);
        if (validMoves().contains(dest)) {
            coordinates = dest;
        }
        //throws an exception to prevent an invalid move from ending the turn
        else {
            throw new IllegalArgumentException("invalid move");
        }
    }

    //each piece has its own method of determining what moves are valid
    abstract ArrayList<Coordinates> validMoves();

    //prints out a list of all valid moves for a piece
    public void printMoves() {
        for (Coordinates coord:validMoves()) {
            System.out.println(coord);
        }
    }
    
}