public class OutBreak {

    protected boolean[][] isVisited;

    public OutBreak() {
    }

    /**
     *
     * @param rooms Two dimensional array of type new Room()
     * @return Will return true if an outbreak of size 5 or greater is detected. Else it will return false.
     */
    public Boolean isOutBreak(Room[][] rooms) {
        isVisited = new boolean[rooms.length][rooms[0].length];

        int sizeOfOutBreak;
        for (int row = 0; row < rooms.length; row++) {
            for (int column = 0; column < rooms[row].length; column++) {
                if(rooms[row][column].isInfected()){
                    sizeOfOutBreak = determineOutbreakSizeWithoutDiag(rooms, row, column);

                    if (sizeOfOutBreak >= 5){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    /**
     *
     * @return Returns an integer value representing the size of an outbreak
     * @param rooms Two dimensional array of type new Room()
     * @param row An existing row within the bounds of row > 0 || row < Rooms.length
     * @param column An existing column within the bounds of column > 0 || column < Rooms[row].length
     */
    protected int determineOutbreakSizeWithoutDiag(Room[][] rooms, int row, int column){
        // Check boundary conditions
        if(row < 0 || column < 0 || row >= rooms.length || column >= rooms[row].length){
            return 0;
        }

        if(!rooms[row][column].isInfected()){
            return 0;
        }

        if (isVisited[row][column]){
            return 0;
        }

        isVisited[row][column] = Boolean.TRUE;

        int numOfInfected = 1;

        numOfInfected += determineOutbreakSizeWithoutDiag(rooms, row - 1, column);
        numOfInfected += determineOutbreakSizeWithoutDiag(rooms, row + 1, column);
        numOfInfected += determineOutbreakSizeWithoutDiag(rooms, row, column + 1);
        numOfInfected += determineOutbreakSizeWithoutDiag(rooms, row, column - 1);


        return numOfInfected;
    }

    public boolean[][] getIsVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean[][] isVisited) {
        this.isVisited = isVisited;
    }
}
