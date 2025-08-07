package idlegears.frontend;

import static com.raylib.Colors.*;
import static com.raylib.Raylib.*;

import idlegears.backend.Board;
import idlegears.backend.Tile;

public class ElementDrawer {
    public ElementDrawer() {}

    public void drawTile(Tile tile) {
        DrawCylinder(new Vector3().x(tile.getPosX()).y(tile.getPosY()).z(tile.getPosZ()), tile.getRadius(), tile.getRadius(), tile.getHeight(), 6, GRAY);
        DrawCylinderWires(new Vector3().x(tile.getPosX()).y(tile.getPosY()).z(tile.getPosZ()), tile.getRadius(), tile.getRadius(), tile.getHeight(), 6,BLACK);
    }

    public void drawBoard(Board board) {
        for (Tile tile: board.getTiles()) {
            drawTile(tile);
        }
    }
}
