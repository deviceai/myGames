package sweeper;

class Flag {
    private Matrix flagMap;
    void start ( ){
        flagMap = new Matrix(Box.CLOSED);
        //flagMap.set(new Coord(4,4), Box.OPENED);
    }

    Box get (Coord coord) {
        return flagMap.get(coord);
    }

    public void setOpenedToBox(Coord coord) {
        flagMap.set(coord, Box.OPENED);
    }
}
