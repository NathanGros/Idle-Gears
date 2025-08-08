package idlegears.frontend;

import static com.raylib.Colors.*;
import static com.raylib.Raylib.*;

import java.util.ArrayList;

import idlegears.backend.Board;
import idlegears.backend.Tile;
import idlegears.backend.pieces.Piece;

public class ElementDrawer {
    public ElementDrawer() {}

    public void drawTile(Tile tile) {
        DrawCylinder(new Vector3().x(tile.getPosX()).y(tile.getPosY()).z(tile.getPosZ()), tile.getRadius(), tile.getRadius(), tile.getHeight(), 6, GRAY);
        DrawCylinderWires(new Vector3().x(tile.getPosX()).y(tile.getPosY()).z(tile.getPosZ()), tile.getRadius(), tile.getRadius(), tile.getHeight(), 6,BLACK);
    }

    public void drawPiece(Piece piece) {
        DrawCylinder(new Vector3().x(piece.getPosX()).y(piece.getPosY()).z(piece.getPosZ()), piece.getRadius(), piece.getRadius(), piece.getHeight(), 30, BLUE);
        DrawCylinderWires(new Vector3().x(piece.getPosX()).y(piece.getPosY()).z(piece.getPosZ()), piece.getRadius(), piece.getRadius(), piece.getHeight(), 30,BLACK);
    }

    public void drawTiles(ArrayList<Tile> tiles) {
        for (Tile tile: tiles) {
            drawTile(tile);
        }
    }

    public void drawPieces(ArrayList<Piece> pieces) {
        for (Piece piece: pieces) {
            drawPiece(piece);
        }
    }

    public void drawBoard(Board board) {
        drawTiles(board.getTiles());
        drawPieces(board.getPieces());
    }

    public void drawGameSpeed(Float gameSpeed) {
        DrawText(gameSpeed.toString(), 50, 50, 20, BLACK);
    }
}
