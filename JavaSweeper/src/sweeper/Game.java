package sweeper;

import javax.crypto.MacSpi;

public class Game {

    Matrix bombMap;

    public Game(int cols, int rows){
        Ranges.setSize(new Coord(cols, rows));

    }

    public void start (){
        bombMap = new Matrix(Box.CLOSED);
    }

    public Box getBox(Coord coord){
        //return  Box.values()[(coord.x + coord.y) % Box.values().length];
        return bombMap.get(coord);
    }
}
