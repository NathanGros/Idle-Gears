package idlegears.backend;

import java.util.ArrayList;

import idlegears.backend.pieces.*;

public class Board {
    ArrayList<Tile> tiles;
    ArrayList<Piece> pieces;

	public ArrayList<Tile> getTiles() {
		return tiles;
	}

    public ArrayList<Piece> getPieces() {
		return pieces;
	}

	public Board() {
        tiles = new ArrayList<Tile>();
        buildBoardTiles();
        pieces = new ArrayList<Piece>();
        buildBoardPieces();
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

    public void addPiece(Piece piece) {
        pieces.add(piece);
    }

    public void buildBoardTiles() {
        Tile t1 = new Tile(0, 0, 0);
        Tile t2 = new Tile(1, 0, 0);
        Tile t3 = new Tile(2, 0, 0);
        Tile t4 = new Tile(0, 0, 2);
        Tile t5 = new Tile(1, 0, 1);
        Tile t6 = new Tile(2, 0, 1);
        addTile(t1);
        addTile(t2);
        addTile(t3);
        addTile(t4);
        addTile(t5);
        addTile(t6);
    }

    public void buildBoardPieces() {
        Clock p1 = new Clock();
        p1.setPosY(0.2f);
        Gear p2 = new Gear();
        p2.setPosX(1.5f);
        p2.setPosY(0.2f);
        p2.setPosZ(1.0f);
        p2.setRadius(0.3f);
        Crank p3 = new Crank();
        p3.setPosX(2.0f);
        p3.setPosY(0.2f);
        p3.setRadius(0.4f);
        addPiece(p1);
        addPiece(p2);
        addPiece(p3);
    }

    public Float computeGameSpeed() {
        for (Piece piece: pieces) {
            if (piece instanceof Clock) {
                return piece.getRotation();
            }
        }
        return 1.f;
    }
}
