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

    void setFlaggedToBox (Coord coord){
        switch (flagMap.get(coord)){
            case FLAGED: setClosedToBox(coord); break;
            case CLOSED: setFlagedToBox(coord); break;
        }
    }

    private void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.CLOSED);
    }

    public void setFlagedToBox(Coord coord) {
        flagMap.set (coord, Box.FLAGED);

    }
}
