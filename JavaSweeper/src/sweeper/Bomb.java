package sweeper;

class Bomb {

    private Matrix bombMap;
    private int totalBombs;

    Bomb (int totalBombs){
        this.totalBombs = totalBombs;
    }

    void start(){
        bombMap = new Matrix(Box.ZERO);
        for (int j = 0; j< totalBombs; j++){
            placeBomb();
        }

    }

    Box get (Coord coord){
        return bombMap.get(coord);
    }

    private void placeBomb() {
        Coord coord = Ranges.getRandomCoord();
        //bombMap.set(new Coord(4,4), Box.BOMB);
        bombMap.set(coord, Box.BOMB);
        for (Coord around : Ranges.getCoordsAround(coord)){
            bombMap.set (around, Box.NUM1);
        }

    }


}
