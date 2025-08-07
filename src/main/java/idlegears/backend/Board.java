package idlegears.backend;

import java.util.ArrayList;

public class Board {
    ArrayList<Tile> tiles;

    public ArrayList<Tile> getTiles() {
		return tiles;
	}

	public Board() {
        tiles = new ArrayList<Tile>();
        buildBoard();
    }

    public void addTile(Tile tile) {
        tiles.add(tile);
    }

    public void removeTile(Integer gridPosX, Integer gridPosY, Integer gridPosZ) {
        for (Tile tile: tiles) {
            if (tile.getGridPosX() == gridPosX && tile.getGridPosY() == gridPosY && tile.getGridPosZ() == gridPosZ)
                tiles.remove(tile);
        }
    }

    public void buildBoard() {
        Tile t1 = new Tile(0, 0, 0);
        Tile t2 = new Tile(1, 0, 0);
        Tile t3 = new Tile(2, 0, 0);
        Tile t4 = new Tile(0, 0, 2);
        Tile t5 = new Tile(1, 0, 2);
        Tile t6 = new Tile(2, 0, 2);
        addTile(t1);
        addTile(t2);
        addTile(t3);
        addTile(t4);
        addTile(t5);
        addTile(t6);
    }
}
