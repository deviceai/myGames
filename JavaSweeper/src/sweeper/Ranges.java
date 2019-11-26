package sweeper;

import java.util.ArrayList;

public class Ranges {

    private static Coord size;
    private static ArrayList<Coord> allCoords;

    public static void  setSize (Coord s){
        size = s;
        allCoords = new ArrayList<Coord>();
        for (int y = 0; y < size.y; y++){
            for (int x = 0; x < size.x; x++){
                allCoords.add(new Coord(x,y));
            }
        }
    }
    public static Coord getSize(){
        return size;
    }

    public static ArrayList<Coord> getAllCoords (){
        return allCoords;
    }
}
